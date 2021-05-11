import java.util.Comparator;

class sortby implements Comparator<Pyramid>
{
    // Used for sorting in descending order of
    // pyramids height 

	@Override
	public int compare(Pyramid o1, Pyramid o2) {

		return (int) (o2.getHeight()-o1.getHeight());
	}
}