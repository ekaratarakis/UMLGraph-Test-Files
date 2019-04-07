/**
 * @opt nodefillcolor "#CD5C5C"
 * @opt operations
 */
interface HospitalInterface
{
	void hospitalName();
	void department();
	void bookNewRoom();
}
/**
 * @opt nodefillcolor "#40E0D0"
 * @opt operations
 */
abstract class Hospital implements HospitalInterface
{
	public abstract void insertNewDoctor();
	public int doctorInsertionApproval()
	{
		return 1;
	}
}

/**
 * @opt nodefillcolor "#DDA0DD"
 * @opt operations
 */
class Doctor extends Hospital 
{
	public void printDoctorsFile();
	public int deleteDoctrosFile()
	{
		return 1;
	}
}

/**
 * @opt nodefillcolor "#DDA0DD"
 * @opt operations
 */
class Patient extends Hospital 
{
	public void printPatientFile();
	public int deletePatiensFile()
	{
		return 1;
	}
}

/**
 * @opt nodefillcolor "#DDA0DD"
 * @opt operations
 */
class Department extends Hospital 
{
	public void printDepartemsInfo();
}

/**  
* @depend - <friend> - Hospital
* @opt nodefillcolor "#228B22"
* @opt operations
*/
class ManagementDepartment {}



