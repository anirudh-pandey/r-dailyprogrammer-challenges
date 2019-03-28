import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// System.out.println("Enter the plaintext:");
		System.out.println("Enter the number of rows and columns of matrix 1:");
		int r1 = scanner.nextInt();
		int c1 = scanner.nextInt();
		System.out.println("Enter the number of rows and columns of matrix 2:");
		int r2 = scanner.nextInt();
		int c2 = scanner.nextInt();
		Cipher cipher = new Cipher(r1, c1, r2, c2);
		cipher.printMatrix();
		cipher.addMatrix();
		cipher.subtractMatrix();
	}
}

class Cipher {
	private int[][] matrix1, matrix2;
	private int r1, c1, r2, c2;
	private Scanner scanner = new Scanner(System.in);


	public Cipher(int r1, int c1, int r2, int c2) {
		this.r1 = r1;
		this.c1 = c1;
		this.r2 = r2;
		this.c2 = c2;
		if(r1!=r2 || c1!=c2) {
			System.out.println("To add/subtract two matrices their rows and columns should be same.");
			return;
		}
		matrix1 = new int[r1][c1];
		matrix2 = new int[r2][c2];
		for(int i=0; i<r1; i++) {
			for(int j=0; j<c1; j++) {
				matrix1[i][j] = scanner.nextInt();
			}
		}
		for(int i=0; i<r2; i++) {
			for(int j=0; j<c2; j++) {
				matrix2[i][j] = scanner.nextInt();
			}
		}
	}

	public void printMatrix() {
		System.out.println("Matrix1:---");
		for(int i=0; i<r1; i++) {
			for(int j=0; j<c1; j++) {
				System.out.print(matrix1[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Matrix2:---");
		for(int i=0; i<r2; i++) {
			for(int j=0; j<c2; j++) {
				System.out.print(matrix2[i][j]+" ");
			}
			System.out.println();
		}
	}

	public void addMatrix() {
		int[][] resultantAddMatrix = new int[r1][c1];
		for(int i=0; i<r1; i++) {
			for(int j=0; j<c1; j++) {
				resultantAddMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}

		System.out.println("After adding we get the resultant matrix as:");
		for(int i=0; i<r1; i++) {
			for(int j=0; j<c1; j++) {
				System.out.print(resultantAddMatrix[i][j]+" ");
			}
			System.out.println();
		}
	}

	public void subtractMatrix() {
		int[][] resultantSubtractMatrix = new int[r1][c1];
		for(int i=0; i<r1; i++) {
			for(int j=0; j<c1; j++) {
				resultantSubtractMatrix[i][j] = matrix1[i][j] - matrix2[i][j];
			}
		}

		System.out.println("After subtracting we get the resultant matrix as:");
		for(int i=0; i<r1; i++) {
			for(int j=0; j<c1; j++) {
				System.out.print(resultantSubtractMatrix[i][j]+" ");
			}
			System.out.println();
		}
	}
}