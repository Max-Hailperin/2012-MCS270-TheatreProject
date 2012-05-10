package theatreProject.shared;

import java.io.Serializable;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import theatreProject.shared.Status;

@PersistenceCapable(identityType=IdentityType.APPLICATION)
public class InventoryObject implements Serializable{

	private static final long serialVersionUID = 1L;

	@PrimaryKey
	@Persistent(valueStrategy=IdGeneratorStrategy.IDENTITY)
	private int ID;

	@Persistent
	private String name;

	@Persistent
	private String storageArea;

	@Persistent
	private String imageURL;

	@Persistent(serialized="true")
	private Status status;

	@Persistent
	private String disclaimers;

	@Persistent
	public String description;

	public InventoryObject() {
		super();
		this.status = new Status();
		
		//TEMPORARY\\
		this.description = "red chair flower";
		this.name = "name of object";
		this.imageURL = "www.joerox.com";
		//END TEMP\\
	}

	@Override
	public boolean equals(Object o){
		if(!(o instanceof InventoryObject))
			return false;
		InventoryObject other = (InventoryObject) o;
		if(this.name == null && other.name != null)
			return false;
		if(this.name != null && !this.name.equals(other.name))
			return false;
		if(!(this.ID == other.ID))
			return false;
		if(this.storageArea == null && other.storageArea != null)
			return false;
		if(this.storageArea != null && !this.storageArea.equals(other.storageArea))
			return false;
		if(this.imageURL == null && other.imageURL != null)
			return false;
		if(this.imageURL != null && !this.imageURL.equals(other.imageURL))
			return false;
		if(this.status == null && other.imageURL != null)
			return false;
		if(this.status != null && !this.status.equals(other.status))
			return false;
		if(this.description == null && other.description != null)
			return false;
		if(this.description != null && !this.description.equals(other.description))
			return false;
		if(this.disclaimers == null && other.disclaimers != null)
			return false;
		if(this.disclaimers != null && !this.disclaimers.equals(other.disclaimers))
			return false;
		return true;
	}

	public int getID() {
		return this.ID;
	}

	public void setID(int newID) {
		this.ID = newID;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String newName) {
		this.name = newName;
	}

	public String getStorageArea() {
		return this.storageArea;
	}

	public void setStorageArea(String newStorageArea) {
		this.storageArea = newStorageArea;
	}

	public String getImageURL() {
		return this.imageURL;
	}

	public void setImage(String newImageURL) {
		this.imageURL = newImageURL;
	}

	public Status getStatus() {
		return this.status;
	}

	public void setStatus(Status newStatus) {
		this.status = newStatus;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String newDesc) {
		this.description = newDesc;
	}

	public String getDisclaimers() {
		return this.disclaimers;
	}

	public void setDisclaimers(String newDisc) {
		this.disclaimers = newDisc;
	}

}
