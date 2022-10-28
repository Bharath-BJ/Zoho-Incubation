package CodingNinjas;

public class Trie 
{
	private TrieNode root;
	public Trie()
	{
		root=new TrieNode('\0');
	}
	public void add(String word)
	{
		addHelper(root,word);
	}
	private void addHelper(TrieNode root,String word)
	{
		if(word.length()==0)
		{
			root.isTerminal=true;
			return; 
		}
		int childIndex=word.charAt(0)-'a';
		TrieNode child=root.children[childIndex];
		if(child==null)
		{
			child=new TrieNode(word.charAt(0));
			root.children[childIndex]=child;
			root.childCount++;
		}
		addHelper(child,word.substring(1));
	}
	public boolean search(String word)
	{
		return searchHelper(root,word);
	}
	private boolean searchHelper(TrieNode root,String word)
	{
		if(word.length()==0)
		{
			return root.isTerminal;
		}
		int childIndex=word.charAt(0)-'a';
		TrieNode child=root.children[childIndex];
		if(child==null)
		{
			return false;
		}
	return searchHelper(child,word.substring(1));
	}
	public void remove(String word)
	{
		removeHelper(root,word);
	}
	private void removeHelper(TrieNode root,String word)
	{
		if(word.length()==0)
		{
			root.isTerminal=false;
			return;
		}
		int childIndex = word.charAt(0)-'a';
		TrieNode child = root.children[childIndex];
		if(child==null)
		{
			return;
		}
		removeHelper(child,word.substring(1));
		if(!child.isTerminal && child.childCount==0 )
		{
			root.children[childIndex]=null;
			root.childCount--;
		}
	}
	public int countWords() {
		return countHelper(root);
	}
	private int countHelper(TrieNode root)
    {
        int count=0; 
     	if(root.isTerminal)
        {
            count++;
        }
        for(int i=0;i<root.children.length;i++)
        {
            if(root.children[i]!=null)
            {
                TrieNode child=root.children[i];
            	count+=countHelper(child);
            }
        }
	return count;
    }
	public void autoComplete(String word)
	{
		TrieNode child = findWord(root,word);
		if(child!=null)
			allPossibleWords(root,word,"");
		
	}
	private TrieNode findWord(TrieNode root,String word)
	{
		if(word.length()==0)
			return root;
		int childIndex = word.charAt(0)-'a';
		TrieNode child = root.children[childIndex];
		if(child==null)
			return null;
		findWord(child,word.substring(1));
	return root;
	}
	private void allPossibleWords(TrieNode root,String word,String output)
	{
		if(root.isTerminal)
		{
			System.out.println(output);
		}
		for(int i=0;i<root.children.length;i++)
		{
			TrieNode child=root.children[i];
			if(child!=null)
			{
			output+=child.data;
			allPossibleWords(child,word,output);
			}
		}
	}
}
