package yads;

import android.os.SystemClock;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class vo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f44100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f44101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f44102c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Random f44103d;

    public vo() {
        this(new Random());
    }

    public static int a(uo uoVar, uo uoVar2) {
        int iCompare = Integer.compare(uoVar.f43744c, uoVar2.f43744c);
        return iCompare != 0 ? iCompare : uoVar.f43743b.compareTo(uoVar2.f43743b);
    }

    public final uo b(r51 r51Var) {
        uo uoVar;
        ArrayList arrayListA = a(r51Var);
        if (arrayListA.size() < 2) {
            Iterator it = arrayListA.iterator();
            return (uo) (it.hasNext() ? it.next() : null);
        }
        Collections.sort(arrayListA, new zl.v(4));
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i10 = ((uo) arrayListA.get(0)).f43744c;
        int i11 = 0;
        while (true) {
            if (i11 >= arrayListA.size()) {
                break;
            }
            uo uoVar2 = (uo) arrayListA.get(i11);
            if (i10 == uoVar2.f43744c) {
                arrayList.add(new Pair(uoVar2.f43743b, Integer.valueOf(uoVar2.f43745d)));
                i11++;
            } else if (arrayList.size() == 1) {
                return (uo) arrayListA.get(0);
            }
        }
        uo uoVar3 = (uo) this.f44102c.get(arrayList);
        if (uoVar3 != null) {
            return uoVar3;
        }
        List listSubList = arrayListA.subList(0, arrayList.size());
        int i12 = 0;
        for (int i13 = 0; i13 < listSubList.size(); i13++) {
            i12 += ((uo) listSubList.get(i13)).f43745d;
        }
        int iNextInt = this.f44103d.nextInt(i12);
        int i14 = 0;
        while (true) {
            if (i >= listSubList.size()) {
                uoVar = (uo) xd1.a(listSubList);
                break;
            }
            uoVar = (uo) listSubList.get(i);
            i14 += uoVar.f43745d;
            if (iNextInt < i14) {
                break;
            }
            i++;
        }
        this.f44102c.put(arrayList, uoVar);
        return uoVar;
    }

    public vo(Random random) {
        this.f44102c = new HashMap();
        this.f44103d = random;
        this.f44100a = new HashMap();
        this.f44101b = new HashMap();
    }

    public static void a(long j10, HashMap map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            if (((Long) entry.getValue()).longValue() <= j10) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            map.remove(arrayList.get(i));
        }
    }

    public final ArrayList a(r51 r51Var) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        a(jElapsedRealtime, this.f44100a);
        a(jElapsedRealtime, this.f44101b);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < r51Var.size(); i++) {
            uo uoVar = (uo) r51Var.get(i);
            if (!this.f44100a.containsKey(uoVar.f43743b) && !this.f44101b.containsKey(Integer.valueOf(uoVar.f43744c))) {
                arrayList.add(uoVar);
            }
        }
        return arrayList;
    }
}
