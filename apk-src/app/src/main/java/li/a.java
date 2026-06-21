package li;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import ei.b;
import h3.e;
import hi.g;
import ii.p;
import ii.s;
import java.util.HashMap;
import m.h3;
import z2.w;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class a implements b, fi.a, s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PackageManager f28125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public fi.b f28126c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public HashMap f28127d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap f28128e = new HashMap();

    public a(e eVar) {
        this.f28125b = (PackageManager) eVar.f20375c;
        eVar.f20376d = this;
    }

    @Override // ii.s
    public final boolean a(int i, int i10, Intent intent) {
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = this.f28128e;
        if (!map.containsKey(numValueOf)) {
            return false;
        }
        ((p) map.remove(Integer.valueOf(i))).success(i10 == -1 ? intent.getStringExtra("android.intent.extra.PROCESS_TEXT") : null);
        return true;
    }

    public final void b(String str, String str2, boolean z5, g gVar) {
        if (this.f28126c == null) {
            gVar.b("error", "Plugin not bound to an Activity", null);
            return;
        }
        HashMap map = this.f28127d;
        if (map == null) {
            gVar.b("error", "Can not process text actions before calling queryTextActions", null);
            return;
        }
        ResolveInfo resolveInfo = (ResolveInfo) map.get(str);
        if (resolveInfo == null) {
            gVar.b("error", "Text processing activity not found", null);
            return;
        }
        int iHashCode = gVar.hashCode();
        this.f28128e.put(Integer.valueOf(iHashCode), gVar);
        Intent intent = new Intent();
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        intent.setClassName(activityInfo.packageName, activityInfo.name);
        intent.setAction("android.intent.action.PROCESS_TEXT");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.PROCESS_TEXT", str2);
        intent.putExtra("android.intent.extra.PROCESS_TEXT_READONLY", z5);
        ((w) ((h3) this.f28126c).f28250b).startActivityForResult(intent, iHashCode);
    }

    public final HashMap c() {
        HashMap map = this.f28127d;
        PackageManager packageManager = this.f28125b;
        if (map == null) {
            this.f28127d = new HashMap();
            Intent type = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
            for (ResolveInfo resolveInfo : Build.VERSION.SDK_INT >= 33 ? packageManager.queryIntentActivities(type, PackageManager.ResolveInfoFlags.of(0L)) : packageManager.queryIntentActivities(type, 0)) {
                String str = resolveInfo.activityInfo.name;
                resolveInfo.loadLabel(packageManager).toString();
                this.f28127d.put(str, resolveInfo);
            }
        }
        HashMap map2 = new HashMap();
        for (String str2 : this.f28127d.keySet()) {
            map2.put(str2, ((ResolveInfo) this.f28127d.get(str2)).loadLabel(packageManager).toString());
        }
        return map2;
    }

    @Override // fi.a
    public final void onAttachedToActivity(fi.b bVar) {
        this.f28126c = bVar;
        ((h3) bVar).a(this);
    }

    @Override // fi.a
    public final void onDetachedFromActivity() {
        ((h3) this.f28126c).g(this);
        this.f28126c = null;
    }

    @Override // fi.a
    public final void onDetachedFromActivityForConfigChanges() {
        ((h3) this.f28126c).g(this);
        this.f28126c = null;
    }

    @Override // fi.a
    public final void onReattachedToActivityForConfigChanges(fi.b bVar) {
        this.f28126c = bVar;
        ((h3) bVar).a(this);
    }

    @Override // ei.b
    public final void onAttachedToEngine(ei.a aVar) {
    }

    @Override // ei.b
    public final void onDetachedFromEngine(ei.a aVar) {
    }
}
