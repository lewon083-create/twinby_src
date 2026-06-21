package ge;

import android.util.Log;
import com.appsflyer.internal.m;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.o;
import he.n;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements sb.f, sb.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f20121b;

    public /* synthetic */ d(e eVar) {
        this.f20121b = eVar;
    }

    @Override // sb.f
    public Task c(Object obj) {
        e eVar = this.f20121b;
        Task taskB = eVar.f20125c.b();
        Task taskB2 = eVar.f20126d.b();
        return b4.L(taskB, taskB2).f(eVar.f20124b, new o(eVar, taskB, taskB2, 7));
    }

    @Override // sb.a
    public Object g(Task task) {
        boolean z5;
        e eVar = this.f20121b;
        if (task.isSuccessful()) {
            he.c cVar = eVar.f20125c;
            synchronized (cVar) {
                cVar.f20493c = b4.s(null);
            }
            n nVar = cVar.f20492b;
            synchronized (nVar) {
                nVar.f20553a.deleteFile(nVar.f20554b);
            }
            he.d dVar = (he.d) task.getResult();
            if (dVar != null) {
                JSONArray jSONArray = dVar.f20498d;
                gd.c cVar2 = eVar.f20123a;
                if (cVar2 != null) {
                    try {
                        cVar2.c(e.e(jSONArray));
                    } catch (gd.a e3) {
                        Log.w("FirebaseRemoteConfig", "Could not update ABT experiments.", e3);
                    } catch (JSONException e7) {
                        Log.e("FirebaseRemoteConfig", "Could not parse ABT experiments from the JSON response.", e7);
                    }
                }
                bb.e eVar2 = eVar.f20132k;
                try {
                    ((h3.e) eVar2.f2019c).A(dVar);
                    Iterator it = ((Set) eVar2.f2021e).iterator();
                    while (it.hasNext()) {
                        if (it.next() != null) {
                            throw new ClassCastException();
                        }
                        ((Executor) eVar2.f2020d).execute(new m(2));
                    }
                } catch (g e10) {
                    Log.w("FirebaseRemoteConfig", "Exception publishing RolloutsState to subscribers. Continuing to listen for changes.", e10);
                }
            } else {
                Log.e("FirebaseRemoteConfig", "Activated configs written to disk are null.");
            }
            z5 = true;
        } else {
            z5 = false;
        }
        return Boolean.valueOf(z5);
    }
}
