public class QuickUnionUF
{
    private int[] id;

    public QuickUnionUF(int N)
    {
        id = new int[N];
        for (int i = 0; i < id.length; i++) id[i] = i;
    }

    private int root(int i)
    {
        while (i != id[i])
        {
            // Path compression
            id[i] = id[id[i]];
            i = id[i];
        }
        return i;
    }

    public boolean connected(int p, int q)
    {
        return root(p) == root(q);
    }

    public void union(int p, int q)
    {
        int i = root(q);
        int j = root(q);
        // Weighting
        int[] sz = new int[]{};
        if (i == j) return;
        if (sz[i] < sz[j]) { id[i] = j; sz[j] += sz[i];}
        else               { id[j] = i; sz[i] += sz[j];}
        id[i] = j;
    }
}
