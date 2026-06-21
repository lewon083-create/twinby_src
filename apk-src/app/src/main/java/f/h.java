package f;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.s;
import com.google.android.gms.internal.ads.om1;
import ek.o;
import hl.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f16461a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f16462b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f16463c = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f16464d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient LinkedHashMap f16465e = new LinkedHashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f16466f = new LinkedHashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Bundle f16467g = new Bundle();

    public final boolean a(int i, int i10, Intent intent) {
        String str = (String) this.f16461a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        e eVar = (e) this.f16465e.get(str);
        if ((eVar != null ? eVar.f16453a : null) != null) {
            ArrayList arrayList = this.f16464d;
            if (arrayList.contains(str)) {
                eVar.f16453a.e(eVar.f16454b.parseResult(i10, intent));
                arrayList.remove(str);
                return true;
            }
        }
        this.f16466f.remove(str);
        this.f16467g.putParcelable(str, new a(i10, intent));
        return true;
    }

    public abstract void b(int i, g.b bVar, Object obj);

    public final g c(String key, g.b contract, b callback) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(contract, "contract");
        Intrinsics.checkNotNullParameter(callback, "callback");
        d(key);
        this.f16465e.put(key, new e(contract, callback));
        LinkedHashMap linkedHashMap = this.f16466f;
        if (linkedHashMap.containsKey(key)) {
            Object obj = linkedHashMap.get(key);
            linkedHashMap.remove(key);
            callback.e(obj);
        }
        Bundle bundle = this.f16467g;
        a aVar = (a) l.k(bundle, key);
        if (aVar != null) {
            bundle.remove(key);
            callback.e(contract.parseResult(aVar.f16447b, aVar.f16448c));
        }
        return new g(this, key, contract, 1);
    }

    public final void d(String str) {
        LinkedHashMap linkedHashMap = this.f16462b;
        if (((Integer) linkedHashMap.get(str)) != null) {
            return;
        }
        aj.e nextFunction = new aj.e(3);
        Intrinsics.checkNotNullParameter(nextFunction, "nextFunction");
        ek.j jVar = new ek.j(nextFunction, new o(0, nextFunction));
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        for (Number number : new ek.a(jVar)) {
            Integer numValueOf = Integer.valueOf(number.intValue());
            LinkedHashMap linkedHashMap2 = this.f16461a;
            if (!linkedHashMap2.containsKey(numValueOf)) {
                int iIntValue = number.intValue();
                linkedHashMap2.put(Integer.valueOf(iIntValue), str);
                linkedHashMap.put(str, Integer.valueOf(iIntValue));
                return;
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    public final void e(String key) {
        Integer num;
        Intrinsics.checkNotNullParameter(key, "key");
        if (!this.f16464d.contains(key) && (num = (Integer) this.f16462b.remove(key)) != null) {
            this.f16461a.remove(num);
        }
        this.f16465e.remove(key);
        LinkedHashMap linkedHashMap = this.f16466f;
        if (linkedHashMap.containsKey(key)) {
            StringBuilder sbP = om1.p("Dropping pending result for request ", key, ": ");
            sbP.append(linkedHashMap.get(key));
            Log.w("ActivityResultRegistry", sbP.toString());
            linkedHashMap.remove(key);
        }
        Bundle bundle = this.f16467g;
        if (bundle.containsKey(key)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + key + ": " + ((a) l.k(bundle, key)));
            bundle.remove(key);
        }
        LinkedHashMap linkedHashMap2 = this.f16463c;
        f fVar = (f) linkedHashMap2.get(key);
        if (fVar != null) {
            ArrayList arrayList = fVar.f16456b;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                fVar.f16455a.b((s) it.next());
            }
            arrayList.clear();
            linkedHashMap2.remove(key);
        }
    }
}
