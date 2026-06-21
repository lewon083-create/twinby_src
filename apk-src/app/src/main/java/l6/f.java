package l6;

import android.content.Context;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f27958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f27959c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Executor f27960d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Executor f27961e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public q6.a f27962f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f27963g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f27964h = true;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ge.c f27965j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public HashSet f27966k;

    public f(Context context, String str) {
        this.f27958b = context;
        this.f27957a = str;
        ge.c cVar = new ge.c();
        cVar.f20120a = new HashMap();
        this.f27965j = cVar;
    }

    public final void a(m6.a... aVarArr) {
        if (this.f27966k == null) {
            this.f27966k = new HashSet();
        }
        for (m6.a aVar : aVarArr) {
            this.f27966k.add(Integer.valueOf(aVar.f28693a));
            this.f27966k.add(Integer.valueOf(aVar.f28694b));
        }
        ge.c cVar = this.f27965j;
        cVar.getClass();
        for (m6.a aVar2 : aVarArr) {
            int i = aVar2.f28693a;
            int i10 = aVar2.f28694b;
            HashMap map = cVar.f20120a;
            TreeMap treeMap = (TreeMap) map.get(Integer.valueOf(i));
            if (treeMap == null) {
                treeMap = new TreeMap();
                map.put(Integer.valueOf(i), treeMap);
            }
            m6.a aVar3 = (m6.a) treeMap.get(Integer.valueOf(i10));
            if (aVar3 != null) {
                Log.w("ROOM", "Overriding migration " + aVar3 + " with " + aVar2);
            }
            treeMap.put(Integer.valueOf(i10), aVar2);
        }
    }
}
