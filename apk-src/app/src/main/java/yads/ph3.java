package yads;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ph3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f41928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final be0 f41929b = new be0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fk3 f41930c = new fk3();

    public ph3(Context context) {
        this.f41928a = context.getApplicationContext();
    }

    public final void a(List list, Map map) {
        ArrayList arrayList = new ArrayList(kotlin.collections.t.j(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f41929b.a((String) it.next(), map));
        }
        this.f41930c.getClass();
        ArrayList<String> arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!Intrinsics.a((String) obj, "about:blank")) {
                arrayList2.add(obj);
            }
        }
        for (String str : arrayList2) {
            gi3 gi3VarA = gi3.f38768c.a(this.f41928a);
            gi3VarA.f38771b.a(new dd2(gi3VarA.f38770a, str, new rm3()));
        }
    }
}
