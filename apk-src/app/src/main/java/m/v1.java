package m;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class v1 extends p1 implements q1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Method f28384c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public fe.c f28385b;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f28384c = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public final void a() {
        r1.a(this.mPopup, null);
    }

    public final void b() {
        r1.b(this.mPopup, null);
    }

    @Override // m.q1
    public final void c(l.i iVar, MenuItem menuItem) {
        fe.c cVar = this.f28385b;
        if (cVar != null) {
            cVar.c(iVar, menuItem);
        }
    }

    @Override // m.p1
    public final d1 createDropDownListView(Context context, boolean z5) {
        u1 u1Var = new u1(context, z5);
        u1Var.setHoverListener(this);
        return u1Var;
    }

    public final void d() {
        if (Build.VERSION.SDK_INT > 28) {
            s1.a(this.mPopup, false);
            return;
        }
        Method method = f28384c;
        if (method != null) {
            try {
                method.invoke(this.mPopup, Boolean.FALSE);
            } catch (Exception unused) {
                Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
            }
        }
    }

    @Override // m.q1
    public final void l(l.i iVar, l.j jVar) {
        fe.c cVar = this.f28385b;
        if (cVar != null) {
            cVar.l(iVar, jVar);
        }
    }
}
