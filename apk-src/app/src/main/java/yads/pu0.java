package yads;

import android.content.Context;
import android.view.Menu;
import android.widget.ImageView;
import android.widget.PopupMenu;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class pu0 {
    public static PopupMenu a(Context context, ImageView imageView, List list) {
        PopupMenu popupMenu = new PopupMenu(context, imageView, 5);
        Menu menu = popupMenu.getMenu();
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            menu.add(0, i, 0, ((gu0) it.next()).f38872a);
            i++;
        }
        return popupMenu;
    }
}
