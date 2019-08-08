/*package com.kodilla.testing.forum;

public class ForumPost {
    String postBody;
    String author;

    public ForumPost(String postBody, String author) {
        this.postBody = postBody;
        this.author = author;
    }

    public String getPostBody() {
        return postBody;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ForumPost forumPost = (ForumPost) o;

        if (!postBody.equals(forumPost.postBody)) return false;
        return author.equals(forumPost.author);
    }

    @Override
    public int hashCode() {
        int result = postBody.hashCode();
        result = 31 * result + author.hashCode();
        return result;
    }
    public int getCommentsQuantity() {
        return comments.size();
    }

    public void addComment(ForumPost thePost, String author, String commentBody) {
        ForumComment theComment = new ForumComment(thePost, commentBody, author);
        ForumUser.comments.add(theComment);
    }
    public ForumPost getPost(int postNumber) {
        ForumPost thePost = null;
        if (postNumber >= 0 && postNumber < ForumUser.posts.size()) {
            thePost = ForumUser.posts.get(postNumber);
        }
        return thePost;
    }

    public ForumComment getComment(int commentNumber) {
        ForumComment theComment = null;
        if (commentNumber >= 0 && commentNumber < ForumUser.comments.size()){
            theComment = ForumUser.comments.get(commentNumber);
        }
        return theComment;
    }
    public boolean removePost(ForumPost thePost) {
        boolean result = false;
        if (ForumUser.posts.contains(thePost)){
            ForumUser.posts.remove(thePost);
            result = true;
        }
        return result;
    }

    public boolean removeComment(ForumComment theComment) {
        boolean result = false;
        if (ForumUser.comments.contains(theComment)){
            ForumUser.comments.remove(theComment);
            result = true;
        }
        return result;
    }
}

 */