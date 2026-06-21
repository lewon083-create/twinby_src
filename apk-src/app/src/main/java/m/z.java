package m;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class z {
    public static boolean a(DragEvent dragEvent, TextView textView, Activity activity) {
        g2.c fVar;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                fVar = new v7.f(clipData, 3);
            } else {
                g2.d dVar = new g2.d();
                dVar.f19846c = clipData;
                dVar.f19847d = 3;
                fVar = dVar;
            }
            g2.n0.g(textView, fVar.build());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th2) {
            textView.endBatchEdit();
            throw th2;
        }
    }

    public static boolean b(DragEvent dragEvent, View view, Activity activity) {
        g2.c fVar;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            fVar = new v7.f(clipData, 3);
        } else {
            g2.d dVar = new g2.d();
            dVar.f19846c = clipData;
            dVar.f19847d = 3;
            fVar = dVar;
        }
        g2.n0.g(view, fVar.build());
        return true;
    }
}
