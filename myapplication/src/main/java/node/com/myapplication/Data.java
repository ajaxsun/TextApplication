package node.com.myapplication;

import java.util.ArrayList;

/**
 * Created by 孙伟
 * Date: 2018/12/7
 * Email: 1580440730@qq.com
 * Describe:
 */
public class Data {

    private String title;
    private ArrayList<String> bean;

    private Data(Builder builder) {
        setTitle(builder.title);
        setBean(builder.bean);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<String> getBean() {
        return bean;
    }

    public void setBean(ArrayList<String> bean) {
        this.bean = bean;
    }


    public static final class Builder {
        private String title;
        private ArrayList<String> bean;

        public Builder() {
        }

        public Builder title(String val) {
            title = val;
            return this;
        }

        public Builder bean(ArrayList<String> val) {
            bean = val;
            return this;
        }

        public Data build() {
            return new Data(this);
        }
    }
}
