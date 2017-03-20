package com.wjs.collectioncode.widget.dynamicimageview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import com.wjs.collectioncode.R;
import com.wjs.collectioncode.utils.GlideUtils;
import com.wjs.wjslibrary.ninepatch.ItemImageClickListener;
import com.wjs.wjslibrary.ninepatch.NinePatchImageView;
import com.wjs.wjslibrary.ninepatch.NinePatchImageViewAdapter;

import java.util.List;

/**
 * Created by Jaeger on 16/2/24.
 * <p>
 * Email: chjie.jaeger@gmail.com
 * GitHub: https://github.com/laobie
 */
public class PostAdapter extends RecyclerView.Adapter<PostAdapter.PostViewHolder> {
    private LayoutInflater mInflater;
    private List<Post> mPostList;
    private int mShowStyle;

    public PostAdapter(Context context, List<Post> postList, int showStyle) {
        super();
        mPostList = postList;
        mInflater = LayoutInflater.from(context);
        mShowStyle = showStyle;
    }

    @Override
    public void onBindViewHolder(PostViewHolder holder, int position) {
        holder.bind(mPostList.get(position));
    }

    @Override
    public int getItemCount() {
        return mPostList.size();
    }

    @Override
    public PostViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (mShowStyle == NinePatchImageView.STYLE_FILL) {
            return new PostViewHolder(mInflater.inflate(R.layout.item_post_fill_style, parent, false));
        } else {
            return new PostViewHolder(mInflater.inflate(R.layout.item_post_grid_style, parent, false));
        }
    }

    public class PostViewHolder extends RecyclerView.ViewHolder {
        private NinePatchImageView<String> mNglContent;
        private TextView mTvContent;

        private NinePatchImageViewAdapter<String> mAdapter = new NinePatchImageViewAdapter<String>() {
            @Override
            protected void onDisplayImage(Context context, ImageView imageView, String s) {
                GlideUtils.displayImageView(context, s, imageView, R.drawable.ic_default_image);
//                Picasso.with(context).load(s).placeholder(R.drawable.ic_default_image).into(imageView);
            }

            @Override
            protected ImageView generateImageView(Context context) {
                return super.generateImageView(context);
            }

            @Override
            protected void onItemImageClick(Context context, ImageView imageView, int index, List<String> list) {
                Toast.makeText(context, "image position is " + index, Toast.LENGTH_SHORT).show();
            }
        };

        public PostViewHolder(View itemView) {
            super(itemView);
            mTvContent = (TextView) itemView.findViewById(R.id.tv_content);
            mNglContent = (NinePatchImageView<String>) itemView.findViewById(R.id.ngl_images);
            mNglContent.setAdapter(mAdapter);
            mNglContent.setItemImageClickListener(new ItemImageClickListener<String>() {
                @Override
                public void onItemImageClick(Context context, ImageView imageView, int index, List<String> list) {
                    Log.d("onItemImageClick", list.get(index));
                }
            });
        }

        public void bind(Post post) {
            mNglContent.setImagesData(post.getImgUrlList());
            mTvContent.setText(post.getContent());

            Log.d("jaeger", "九宫格高度: " + mNglContent.getMeasuredHeight());
            Log.d("jaeger", "item 高度: " + itemView.getMeasuredHeight());
        }
    }
}
