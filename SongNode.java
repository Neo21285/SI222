//สร้าง SongNode
Class SongNode{
    String title;
    String artist;
    SongNode Next;
    SongeNode prev;
    public SongeNode (String title,String artist){
        this.title = title;
        this.artist = artist;
        this.Next = null;
        this.prev = null;
     
    }
}
Class MusicPlaylist{
    private SongeNode head;
    private  SongeNode tail;
    private int size;
    public MusicPlaylist {
        this.head
        this.tail
        this.size = 0;
    }
}

//1.เพิ่ทเพลงที่หัว (Add at Head)
public void add SongAtHead(String title,String artist){
    SongeNode newSong = new SongeNode (title,artist){
        if (head = null) {
            head = newSong;
            tail = newSong;
            head.next = head;
            head.prev = head
        }else{
            newSong.next = head;
            newSong.prev = tail;
            head.prev = newSong;
            tail.next = newSong;
            head = newSong;
        } 
            size++;
        }
    } 

}