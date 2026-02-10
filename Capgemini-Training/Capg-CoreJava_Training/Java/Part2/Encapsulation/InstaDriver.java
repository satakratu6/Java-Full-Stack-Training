package Encapsulation;

public class InstaDriver {

	public static void main(String[] args) {
		Instagram i1=new Instagram();
		i1.setPost(18);
		i1.setFollowing(2000);
		System.out.println(i1.getPost());
		System.out.println(i1.getFollowing());
	}

}
