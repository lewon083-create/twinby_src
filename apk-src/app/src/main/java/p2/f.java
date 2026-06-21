package p2;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.internal.measurement.h5;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends oj.i implements Function1 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f30962l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f30963m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f30964n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Object obj, mj.a aVar, int i) {
        super(1, aVar);
        this.f30962l = i;
        this.f30964n = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        mj.a aVar = (mj.a) obj;
        switch (this.f30962l) {
            case 0:
                return new f((r2.c) this.f30964n, aVar, 0).invokeSuspend(Unit.f27471a);
            default:
                return new f((a0) this.f30964n, aVar, 1).invokeSuspend(Unit.f27471a);
        }
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Context context;
        String str;
        switch (this.f30962l) {
            case 0:
                nj.a aVar = nj.a.f29512b;
                int i = this.f30963m;
                if (i == 0) {
                    h5.E(obj);
                    r2.c cVar = (r2.c) this.f30964n;
                    this.f30963m = 1;
                    SharedPreferences.Editor editorEdit = ((SharedPreferences) cVar.f32182e.getValue()).edit();
                    LinkedHashSet linkedHashSet = cVar.f32183f;
                    if (linkedHashSet == null) {
                        editorEdit.clear();
                    } else {
                        Iterator it = linkedHashSet.iterator();
                        while (it.hasNext()) {
                            editorEdit.remove((String) it.next());
                        }
                    }
                    if (!editorEdit.commit()) {
                        throw new IOException("Unable to delete migrated keys from SharedPreferences.");
                    }
                    if (((SharedPreferences) cVar.f32182e.getValue()).getAll().isEmpty() && (context = cVar.f32180c) != null && (str = cVar.f32181d) != null) {
                        r2.a.a(context, str);
                    }
                    if (linkedHashSet != null) {
                        linkedHashSet.clear();
                    }
                    if (Unit.f27471a == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h5.E(obj);
                }
                return Unit.f27471a;
            default:
                nj.a aVar2 = nj.a.f29512b;
                int i10 = this.f30963m;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h5.E(obj);
                    return obj;
                }
                h5.E(obj);
                a0 a0Var = (a0) this.f30964n;
                this.f30963m = 1;
                Object objInvoke = a0Var.invoke(this);
                return objInvoke == aVar2 ? aVar2 : objInvoke;
        }
    }
}
