package t7;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.foreground.SystemForegroundService;
import com.google.android.gms.internal.ads.om1;
import com.google.android.gms.internal.ads.pf;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import l7.g;
import l7.n;
import m7.l;
import q.e;
import q7.c;
import t.z;
import u7.j;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements q7.b, m7.b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f33528k = n.i("SystemFgDispatcher");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f33529b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x7.a f33530c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f33531d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f33532e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f33533f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashMap f33534g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashSet f33535h;
    public final c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public SystemForegroundService f33536j;

    public b(Context context) {
        l lVarO = l.O(context);
        this.f33529b = lVarO;
        x7.b bVar = lVarO.f28733e;
        this.f33530c = bVar;
        this.f33532e = null;
        this.f33533f = new LinkedHashMap();
        this.f33535h = new HashSet();
        this.f33534g = new HashMap();
        this.i = new c(context, bVar, this);
        lVarO.f28735g.a(this);
    }

    public static Intent a(Context context, String str, g gVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", gVar.f28025a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", gVar.f28026b);
        intent.putExtra("KEY_NOTIFICATION", gVar.f28027c);
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent b(Context context, String str, g gVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NOTIFICATION_ID", gVar.f28025a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", gVar.f28026b);
        intent.putExtra("KEY_NOTIFICATION", gVar.f28027c);
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    @Override // m7.b
    public final void c(String str, boolean z5) {
        Map.Entry entry;
        synchronized (this.f33531d) {
            try {
                j jVar = (j) this.f33534g.remove(str);
                if (jVar != null ? this.f33535h.remove(jVar) : false) {
                    this.i.b(this.f33535h);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        g gVar = (g) this.f33533f.remove(str);
        if (str.equals(this.f33532e) && this.f33533f.size() > 0) {
            Iterator it = this.f33533f.entrySet().iterator();
            Object next = it.next();
            while (true) {
                entry = (Map.Entry) next;
                if (!it.hasNext()) {
                    break;
                } else {
                    next = it.next();
                }
            }
            this.f33532e = (String) entry.getKey();
            if (this.f33536j != null) {
                g gVar2 = (g) entry.getValue();
                SystemForegroundService systemForegroundService = this.f33536j;
                systemForegroundService.f1785c.post(new e(systemForegroundService, gVar2.f28025a, gVar2.f28027c, gVar2.f28026b));
                SystemForegroundService systemForegroundService2 = this.f33536j;
                systemForegroundService2.f1785c.post(new pf(systemForegroundService2, gVar2.f28025a, 11));
            }
        }
        SystemForegroundService systemForegroundService3 = this.f33536j;
        if (gVar == null || systemForegroundService3 == null) {
            return;
        }
        n.g().e(f33528k, z.d(gVar.f28026b, ")", pe.a.i(gVar.f28025a, "Removing Notification (id: ", ", workSpecId: ", str, " ,notificationType: ")), new Throwable[0]);
        systemForegroundService3.f1785c.post(new pf(systemForegroundService3, gVar.f28025a, 11));
    }

    public final void d(Intent intent) {
        int i = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        n.g().e(f33528k, z.d(intExtra2, ")", pe.a.i(intExtra, "Notifying with (id: ", ", workSpecId: ", stringExtra, ", notificationType: ")), new Throwable[0]);
        if (notification == null || this.f33536j == null) {
            return;
        }
        g gVar = new g(intExtra, notification, intExtra2);
        LinkedHashMap linkedHashMap = this.f33533f;
        linkedHashMap.put(stringExtra, gVar);
        if (TextUtils.isEmpty(this.f33532e)) {
            this.f33532e = stringExtra;
            SystemForegroundService systemForegroundService = this.f33536j;
            systemForegroundService.f1785c.post(new e(systemForegroundService, intExtra, notification, intExtra2));
            return;
        }
        SystemForegroundService systemForegroundService2 = this.f33536j;
        systemForegroundService2.f1785c.post(new ac.a(systemForegroundService2, intExtra, notification, 5));
        if (intExtra2 == 0 || Build.VERSION.SDK_INT < 29) {
            return;
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            i |= ((g) ((Map.Entry) it.next()).getValue()).f28026b;
        }
        g gVar2 = (g) linkedHashMap.get(this.f33532e);
        if (gVar2 != null) {
            SystemForegroundService systemForegroundService3 = this.f33536j;
            systemForegroundService3.f1785c.post(new e(systemForegroundService3, gVar2.f28025a, gVar2.f28027c, i));
        }
    }

    @Override // q7.b
    public final void e(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            n.g().e(f33528k, om1.k("Constraints unmet for WorkSpec ", str), new Throwable[0]);
            l lVar = this.f33529b;
            lVar.f28733e.b(new v7.j(lVar, str, true));
        }
    }

    public final void g() {
        this.f33536j = null;
        synchronized (this.f33531d) {
            this.i.c();
        }
        this.f33529b.f28735g.e(this);
    }

    @Override // q7.b
    public final void f(List list) {
    }
}
