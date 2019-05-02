
package recursivemerge;


    import java.util.List;
    import java.util.ArrayList;
    import java.util.NoSuchElementException;

    
    public class MergeSort 
    {
    
        /**
         * recursive mergeSort()
         * @param List of Comparable type T
         * @return sorted List of Comparable type T
         */
        public static <T extends Comparable<T>> List<T> mergeSort(List<T> m)
        {
            // exception
            if (m==null) throw new NoSuchElementException("List is null");
            // base case
            if (m.size() <= 1) return m;

            // make lists
            List<T> left = new ArrayList<>();
            List<T> right = new ArrayList<>();

            // get middle
            int middle = m.size()/2;

            // fill left list
            for (int i = 0; i < middle; i++)
            {
                if (m.get(i)!=null) left.add(m.get(i));
            }

            // fill right list
            for (int i = middle; i < m.size(); i++)
            {
                if (m.get(i)!=null) right.add(m.get(i));
            }

            // recurse
            left = mergeSort(left);
            right = mergeSort(right);

            // merge
            return merge(left,right);
        }

        /**
         * private merge() method used in mergeSort()
         * @param left List of type T
         * @param right List of type T
         * @return result List of type T
         */
        private static <T extends Comparable<T>> List<T> merge(List<T> left, List<T> right)
        {
            List<T> result = new ArrayList<>();

            // merge
            while (!left.isEmpty() && !right.isEmpty())
            {
                if (left.get(0).compareTo(right.get(0)) <= 0)
                {
                    result.add(left.remove(0));
                }
                else
                {
                    result.add(right.remove(0));
                }
            }

            // cleanup leftovers
            while (!left.isEmpty())
            {
                result.add(left.remove(0));
            }
            while (!right.isEmpty())
            {
                result.add(right.remove(0));
            }
            return result;
        }
       

    }
