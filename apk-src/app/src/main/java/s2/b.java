package s2;

import android.content.Context;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements zj.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m4.d f32421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function1 f32422c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final mk.c f32423d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f32424e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile t2.d f32425f;

    public b(String name, m4.d dVar, Function1 produceMigrations, mk.c scope) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(produceMigrations, "produceMigrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f32420a = name;
        this.f32421b = dVar;
        this.f32422c = produceMigrations;
        this.f32423d = scope;
        this.f32424e = new Object();
    }

    @Override // zj.c
    public final Object getValue(Object obj, dk.i property) {
        t2.d dVar;
        Context thisRef = (Context) obj;
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        t2.d dVar2 = this.f32425f;
        if (dVar2 != null) {
            return dVar2;
        }
        synchronized (this.f32424e) {
            try {
                if (this.f32425f == null) {
                    Context applicationContext = thisRef.getApplicationContext();
                    m4.d dVar3 = this.f32421b;
                    Function1 function1 = this.f32422c;
                    Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
                    this.f32425f = wa.a.i(dVar3, (List) function1.invoke(applicationContext), this.f32423d, new f7.j(2, applicationContext, this));
                }
                dVar = this.f32425f;
                Intrinsics.b(dVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return dVar;
    }
}
