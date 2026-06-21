package s9;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends RelativeLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t9.i f32841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f32842c;

    public h(Context context, String str, String str2, String str3) {
        super(context);
        t9.i iVar = new t9.i(context);
        iVar.f33610c = str;
        this.f32841b = iVar;
        iVar.f33612e = str2;
        iVar.f33611d = str3;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f32842c) {
            return false;
        }
        this.f32841b.a(motionEvent);
        return false;
    }
}
