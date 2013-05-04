/* 
 * Copyright 2013 Phil Pratt-Szeliga and other contributors
 * http://trifort.org/
 * 
 * See the file LICENSE for copying permission.
 */

package apple.awt;

public class CDragSourceContextPeerTest {
  
  public void test(){
    CDragSourceContextPeer source_context_peer = CDragSourceContextPeer.createDragSourceContextPeer(null);
    System.out.println(source_context_peer.toString());
  }
}
