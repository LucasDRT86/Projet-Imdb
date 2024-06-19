package utils;

public class ConvertLieux {

	private String ville;
	private String region;
	private String pays;
	
	public ConvertLieux(String lieu) {
		String[] parts = lieu.split(",");
		
		this.ville = parts[0].trim();
        this.region = parts[1].trim();
        this.pays = parts[2].trim();
	}

	/**
	 * @return the ville
	 */
	public String getVille() {
		return ville;
	}

	/**
	 * @param ville the ville to set
	 */
	public void setVille(String ville) {
		this.ville = ville;
	}

	/**
	 * @return the region
	 */
	public String getRegion() {
		return region;
	}

	/**
	 * @param region the region to set
	 */
	public void setRegion(String region) {
		this.region = region;
	}

	/**
	 * @return the pays
	 */
	public String getPays() {
		return pays;
	}

	/**
	 * @param pays the pays to set
	 */
	public void setPays(String pays) {
		this.pays = pays;
	}
	
	
}
