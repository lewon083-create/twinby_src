package g0;

import android.graphics.Rect;
import android.util.Range;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public interface d0 {
    Set a();

    int c();

    boolean d();

    String e();

    default void f(com.google.firebase.messaging.y yVar) {
        Intrinsics.checkNotNullParameter(yVar, "<set-?>");
        a.a.f9a = yVar;
    }

    List g(Range range);

    Rect h();

    t.k1 i();

    androidx.lifecycle.d0 j();

    boolean k();

    int l();

    s2 m();

    int n(int i);

    Object o();

    b1 p();

    List q();

    a2 r();

    List s(int i);

    androidx.lifecycle.d0 t();

    Set u();

    Set v();

    default d0 b() {
        return this;
    }
}
