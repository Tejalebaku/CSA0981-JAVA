
public class matrixadditon {
	public static void main(String[]args)
	{
		int mat1[][]= {{2,3},{3,4}};
		int mat2[][]= {{1,2},{4,1}};
		int matsum[][]=new int[2][2];
		int len=mat1.length;
		for(int i=0;i<len;i++)
		{
			for(int j=0;j<len;j++)
			{
				matsum[i][j]=mat1[i][j]+mat2[i][j];
				System.out.println(matsum[i][j]+"\t");
			}
		}
		System.out.println();
		
	}
	

}
