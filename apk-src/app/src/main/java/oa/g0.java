package oa;

import ad.m0;
import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 extends Fragment implements h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final WeakHashMap f29854c = new WeakHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m0 f29855b = new m0();

    @Override // oa.h
    public final n a() {
        return (n) n.class.cast(((Map) this.f29855b.f840d).get("ConnectionlessLifecycleHelper"));
    }

    @Override // oa.h
    public final Activity c() {
        return getActivity();
    }

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator it = ((Map) this.f29855b.f840d).values().iterator();
        while (it.hasNext()) {
            ((n) it.next()).getClass();
        }
    }

    @Override // oa.h
    public final void f(n nVar) {
        this.f29855b.u(nVar);
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i, int i10, Intent intent) {
        super.onActivityResult(i, i10, intent);
        this.f29855b.w(i, i10, intent);
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f29855b.v(bundle);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        m0 m0Var = this.f29855b;
        m0Var.f839c = 5;
        Iterator it = ((Map) m0Var.f840d).values().iterator();
        while (it.hasNext()) {
            ((n) it.next()).getClass();
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        m0 m0Var = this.f29855b;
        m0Var.f839c = 3;
        Iterator it = ((Map) m0Var.f840d).values().iterator();
        while (it.hasNext()) {
            ((n) it.next()).d();
        }
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f29855b.x(bundle);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        m0 m0Var = this.f29855b;
        m0Var.f839c = 2;
        for (n nVar : ((Map) m0Var.f840d).values()) {
            nVar.f29863c = true;
            nVar.d();
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        m0 m0Var = this.f29855b;
        m0Var.f839c = 4;
        Iterator it = ((Map) m0Var.f840d).values().iterator();
        while (it.hasNext()) {
            ((n) it.next()).c();
        }
    }
}
