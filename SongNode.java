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
Class MusicPlaylist {
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
public void add Song At Head(String title,String artist){
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

//2.เพิ่มลงที่ท้าย(Add at Tail)
public void add Song At tail(String title,String artist){
    if (head == null)
        add Song at Head(title,artist)
        return;

}
    SongNode new SongNode (title,artist);
    new Song.next = head;
    new Song.prev  = tail;
    tail.next = new Song;
    head.prev = new Song;
    tail = newSong; 
        {
        size++
    }
//3.เพิ่มเพลงที่ตำแหน่งที่กำหนด(Add at position)
public void add Song At Position(String title,String artist)
    int position {
            if (position<0 || position>size){
                System.out.println"ตำแหน่งที่ผิดพลาด";
                return;
            }
            if (position == 0;){
                add  Song At Head(title,artistx);
                return;
            }
            SongeNode new Song = new SongeNode(title,artist)
            for (int i=0; ;<position-1; i++){
                temp = tempinut;
            }
            newSong.next.prev = temp.next;
            newSong.prev = temp;
            temp.next = new Song;
            size++;

    }
    //4.ลบเพลงที่หัว(DeleteHead)
    public void delete Song At Head() {
        if (head == null) return;
        if (size == 1){
            head = null;
            tail = null;
        }
        size -;
    }
    //5.ลบเพลงที่ท้าย(DeleteTail)
    public void delete Song At Tail(){
        if (head == null)  return;
            head = null;
            tail = null;
    } else {
        tail = tail.prev;
        tail.next = head;
        head.prev.tail; 
    }
    size - ;
}

//6.ลบเพลงที่ตำแหน่งที่กำหนด(Delete at position)
public void delete Song At Position (int position);{
    if (position < 0 || position) = size{
        System.out.println"ตำแหน่งที่ผิดพลาด";
        return;
    }
    if (position = 0){
        delete Song At gead ||;
        return;
    }
    if (position==size-1){
        delete Song At tail ||;
    } SongNode temp head;
        for (int i=0;<position if+){
        temp = temp.next
        }
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
        size -;
}