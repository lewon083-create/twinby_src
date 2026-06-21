package yads;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class pr3 extends kotlin.jvm.internal.r implements Function0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qr3 f42002b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pr3(qr3 qr3Var) {
        super(0);
        this.f42002b = qr3Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ef.c cVar = (ef.c) ((a0.a0) this.f42002b.f42378a).f13c;
        cVar.f16368h = true;
        ArrayList arrayList = cVar.f16370k;
        cVar.i = false;
        if (cVar.f16369j) {
            Log.d("flutter_yandex_ad", "initialized");
        }
        List listR = CollectionsKt.R(arrayList);
        arrayList.clear();
        Iterator it = listR.iterator();
        while (it.hasNext()) {
            ((ii.p) it.next()).success(null);
        }
        return Unit.f27471a;
    }
}
