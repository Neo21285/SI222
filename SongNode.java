//สร้าง SongNode
Class SongNode{ 
    String title;
    String artist;
    SongNode next;
    SongeNode prev;
    public SongeNode(String title,String artist){
        this.title = title;
        this.artist = artist;
        this.next = null;
        this.prev = null;
     
    }
}
Class MusicPlaylist {
    private SongeNode head;
    private  SongeNode tail;
    private int size;

    public MusicPlaylist() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
}

//1.เพิ่ทเพลงที่หัว (Add at Head)
public void addSongAtHead(String title,String artist){
    SongeNode newSong = new SongeNode (title,artist){
        if (head == null) {
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

//2.เพิ่มลงที่ท้าย(Add at Tail)
public voidadd SongAtTail(String title,String artist){
    if (head == null)
        addSongATHead(title,artist)
        return;

}
    SongNode newSong = new SongNode(title,artist);
    new Song.next = head;
    new Song.prev  = tail;
    tail.next = new Song;
    head.prev = new Song;
    tail = newSong; 
        {
        size++
    }
//3.เพิ่มเพลงที่ตำแหน่งที่กำหนด(Add at position)
public void add SongAtPosition(String title,String artist,int position) {
            if (position < 0 || position > size) {
                System.out.println("ตำแหน่งที่ผิดพลาด");
                return;
            }
            if (position == 0){
                addSongAtHead(title,artistx);
                return;
            }
            if (position == size {
                addSongTail(Title,artist);
                return;
            }
            SongeNode newSong = new SongeNode(title,artist);
            SongNode temp = head;
            for (int i=0; i < position -1; i++){
                temp = temp.next;
            }
            newSong.next = temp.next;
            newSong.prev = temp;
            temp.next.prev = newSong;
            temp.next = newSong;
            size++;

    }
    //4.ลบเพลงที่หัว(DeleteHead)
    public void deleteSongAtHead() {
        if (head == null) return;
        if (size == 1){
            head = null;
            tail = null;
        }
        size --;
    }
    //5.ลบเพลงที่ท้าย(DeleteTail)
    public void deleteSongAtTail(){
        if (head == null)  return;
            head = null;
            tail = null;
    } else {
        tail = tail.prev;
        tail.next = head;
        head.prev = tail; 
    }
    size --;
}

//6.ลบเพลงที่ตำแหน่งที่กำหนด(Delete at position)
public void deleteSongAtPosition (int position);{
    if (position < 0 || position = size){
        System.out.println"ตำแหน่งที่ผิดพลาด";
        return;
    }
    if (position == 0){
        deleteSongAtHead ();
        return;
    }
    if (position == size - 1) {
        deleteSongAtTail
    } 
    SongNode temp = head;
        for (int i=0; i <position i++){
            temp = temp.next;
        }
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
        size --;
    }

}
