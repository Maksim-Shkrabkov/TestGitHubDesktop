package by.htp.testgit;

public class TestingGitHub {
	
	private int number;
	private String name;
	
	
	private void testMethod() {
		System.out.println("AAAAAAAAAA");
		System.out.println("AAAAAAAAAA");
		System.out.println("AAAAAAAAAA");
		System.out.println("AAAAAAAAAA");
		System.out.println("AAAAAAAAAA");
		System.out.println("BBBBBBBBBBB");
		System.out.println("CCCCCCCCCCC");
	}
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + number;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TestingGitHub other = (TestingGitHub) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (number != other.number)
			return false;
		return true;
	}

	
}
