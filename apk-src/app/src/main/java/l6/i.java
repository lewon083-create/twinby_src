package l6;

import android.content.Context;
import android.content.res.Resources;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.PowerManager;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import androidx.camera.core.internal.compat.quirk.ImageCaptureFailedForSpecificCombinationQuirk;
import androidx.camera.core.internal.compat.quirk.PreviewGreenTintQuirk;
import androidx.lifecycle.d0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.internal.ads.ji0;
import com.google.android.gms.internal.ads.p6;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.twinby.R;
import dev.fluttercommunity.plus.share.SharePlusPendingIntent;
import ii.n;
import ii.o;
import ii.p;
import io.appmetrica.analytics.impl.lp;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import l7.q;
import l7.s;
import l7.t;
import ob.a0;
import ob.a2;
import ob.k2;
import ob.l1;
import ob.o3;
import ob.s0;
import ob.y;
import ob.z0;
import p3.m;
import pa.c0;
import t.z;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements sb.a, t, OnCompleteListener, ed.b, p3.g, k0.c, o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f27977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f27978c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f27979d;

    public /* synthetic */ i(int i, Object obj) {
        this.f27977b = i;
        this.f27979d = obj;
    }

    public static void a(i iVar, boolean z5, boolean z10) {
        synchronized (iVar) {
            boolean z11 = false;
            if (z5) {
                if (((PowerManager.WakeLock) iVar.f27979d) == null) {
                    if (((Context) iVar.f27978c).checkSelfPermission("android.permission.WAKE_LOCK") != 0) {
                        m3.b.s("WakeLockManager", "WAKE_LOCK permission not granted, can't acquire wake lock for playback");
                        return;
                    }
                    PowerManager powerManager = (PowerManager) ((Context) iVar.f27978c).getSystemService("power");
                    if (powerManager == null) {
                        m3.b.s("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                        return;
                    } else {
                        PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                        iVar.f27979d = wakeLockNewWakeLock;
                        wakeLockNewWakeLock.setReferenceCounted(false);
                    }
                }
            }
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) iVar.f27979d;
            if (wakeLock == null) {
                return;
            }
            if (z5 && z10) {
                z11 = true;
            }
            if (z11) {
                wakeLock.acquire();
            } else {
                wakeLock.release();
            }
        }
    }

    public static void c(String str) {
        if (str.equalsIgnoreCase(":memory:") || str.trim().length() == 0) {
            return;
        }
        Log.w("SupportSQLite", "deleting the database file: ".concat(str));
        try {
            SQLiteDatabase.deleteDatabase(new File(str));
        } catch (Exception e3) {
            Log.w("SupportSQLite", "delete failed: ", e3);
        }
    }

    public void b(Object obj, String str) {
        int length = str.length();
        String strValueOf = String.valueOf(obj);
        ((ArrayList) this.f27978c).add(z.g(new StringBuilder(length + 1 + strValueOf.length()), str, "=", strValueOf));
    }

    @Override // p3.g
    public p3.h createDataSource() {
        return new m((Context) this.f27978c, ((p3.g) this.f27979d).createDataSource());
    }

    public oe.k d(com.google.gson.reflect.a aVar) {
        m7.a aVar2;
        Type type = aVar.getType();
        Class rawType = aVar.getRawType();
        Map map = (Map) this.f27978c;
        if (map.get(type) != null) {
            throw new ClassCastException();
        }
        if (map.get(rawType) != null) {
            throw new ClassCastException();
        }
        oe.k yVar = null;
        try {
            Constructor declaredConstructor = rawType.getDeclaredConstructor(null);
            if (!declaredConstructor.isAccessible()) {
                ((qe.b) this.f27979d).a(declaredConstructor);
            }
            aVar2 = new m7.a(11, declaredConstructor);
        } catch (NoSuchMethodException unused) {
            aVar2 = null;
        }
        if (aVar2 != null) {
            return aVar2;
        }
        if (Collection.class.isAssignableFrom(rawType)) {
            yVar = SortedSet.class.isAssignableFrom(rawType) ? new a0(21) : EnumSet.class.isAssignableFrom(rawType) ? new ni.i(5, type) : Set.class.isAssignableFrom(rawType) ? new y(22) : Queue.class.isAssignableFrom(rawType) ? new ob.z(22) : new a0(22);
        } else if (Map.class.isAssignableFrom(rawType)) {
            yVar = ConcurrentNavigableMap.class.isAssignableFrom(rawType) ? new y(23) : ConcurrentMap.class.isAssignableFrom(rawType) ? new ob.z(20) : SortedMap.class.isAssignableFrom(rawType) ? new a0(20) : (!(type instanceof ParameterizedType) || String.class.isAssignableFrom(com.google.gson.reflect.a.get(((ParameterizedType) type).getActualTypeArguments()[0]).getRawType())) ? new ob.z(21) : new y(21);
        }
        return yVar != null ? yVar : new bb.e(rawType, type);
    }

    public q4.k e(Object... objArr) {
        Constructor constructorA;
        synchronized (((AtomicBoolean) this.f27979d)) {
            if (!((AtomicBoolean) this.f27979d).get()) {
                try {
                    constructorA = ((pf.a) this.f27978c).a();
                } catch (ClassNotFoundException unused) {
                    ((AtomicBoolean) this.f27979d).set(true);
                    constructorA = null;
                } catch (Exception e3) {
                    throw new RuntimeException("Error instantiating extension", e3);
                }
            }
            constructorA = null;
        }
        if (constructorA == null) {
            return null;
        }
        try {
            return (q4.k) constructorA.newInstance(objArr);
        } catch (Exception e7) {
            throw new IllegalStateException("Unexpected error creating extractor", e7);
        }
    }

    public String f(String str) {
        String str2 = (String) this.f27979d;
        Resources resources = (Resources) this.f27978c;
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    @Override // sb.a
    public Object g(Task task) {
        Bundle bundle;
        la.b bVar = (la.b) this.f27978c;
        Bundle bundle2 = (Bundle) this.f27979d;
        bVar.getClass();
        return (task.isSuccessful() && (bundle = (Bundle) task.getResult()) != null && bundle.containsKey("google.messenger")) ? bVar.a(bundle2).j(la.h.f28078d, la.d.f28073e) : task;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0071 A[EDGE_INSN: B:94:0x0071->B:34:0x0071 BREAK  A[LOOP:3: B:11:0x0024->B:97:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void h(r6.b r12, int r13, int r14) {
        /*
            Method dump skipped, instruction units count: 346
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l6.i.h(r6.b, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:145:0x0209, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0110 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0109 A[Catch: IOException -> 0x0091, XmlPullParserException -> 0x0094, TryCatch #2 {IOException -> 0x0091, XmlPullParserException -> 0x0094, blocks: (B:20:0x0062, B:97:0x0209, B:28:0x0074, B:29:0x0082, B:31:0x0087, B:38:0x0097, B:46:0x00b1, B:41:0x00a0, B:44:0x00a9, B:47:0x00bf, B:51:0x00ce, B:53:0x00d6, B:54:0x00e0, B:63:0x0109, B:64:0x0110, B:65:0x0128, B:57:0x00e9, B:59:0x00f1, B:60:0x00ff, B:66:0x0129, B:68:0x0131, B:69:0x013f, B:72:0x0149, B:73:0x0154, B:74:0x016c, B:75:0x016d, B:78:0x0177, B:79:0x0182, B:80:0x019a, B:81:0x019b, B:83:0x01a3, B:84:0x01ac, B:87:0x01b6, B:88:0x01c0, B:89:0x01d8, B:90:0x01d9, B:93:0x01e3, B:94:0x01ed, B:95:0x0205, B:96:0x0206), top: B:105:0x0062 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void i(android.content.Context r12, android.content.res.XmlResourceParser r13) {
        /*
            Method dump skipped, instruction units count: 608
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l6.i.i(android.content.Context, android.content.res.XmlResourceParser):void");
    }

    public void j(i0.o oVar) {
        w7.j jVar = (w7.j) this.f27979d;
        ((d0) this.f27978c).i(oVar);
        if (oVar instanceof s) {
            jVar.j((s) oVar);
        } else if (oVar instanceof q) {
            jVar.k(((q) oVar).f28056b);
        }
    }

    public m3.a k() throws IOException {
        File file = (File) this.f27979d;
        File file2 = (File) this.f27978c;
        if (file2.exists()) {
            if (file.exists()) {
                file2.delete();
            } else if (!file2.renameTo(file)) {
                m3.b.s("AtomicFile", "Couldn't rename file " + file2 + " to backup file " + file);
            }
        }
        try {
            return new m3.a(file2);
        } catch (FileNotFoundException e3) {
            File parentFile = file2.getParentFile();
            if (parentFile == null || !parentFile.mkdirs()) {
                throw new IOException("Couldn't create " + file2, e3);
            }
            try {
                return new m3.a(file2);
            } catch (FileNotFoundException e7) {
                throw new IOException("Couldn't create " + file2, e7);
            }
        }
    }

    public void l(r6.b bVar) {
        bVar.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        bVar.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
    }

    public int m(Context context, na.c cVar) {
        int i;
        int iC;
        c0.i(context);
        c0.i(cVar);
        int iB = cVar.b();
        SparseIntArray sparseIntArray = (SparseIntArray) this.f27978c;
        synchronized (sparseIntArray) {
            i = sparseIntArray.get(iB, -1);
        }
        if (i != -1) {
            return i;
        }
        SparseIntArray sparseIntArray2 = (SparseIntArray) this.f27978c;
        synchronized (sparseIntArray2) {
            iC = 0;
            int i10 = 0;
            while (true) {
                try {
                    if (i10 >= sparseIntArray2.size()) {
                        iC = -1;
                        break;
                    }
                    int iKeyAt = sparseIntArray2.keyAt(i10);
                    if (iKeyAt > iB && sparseIntArray2.get(iKeyAt) == 0) {
                        break;
                    }
                    i10++;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (iC == -1) {
                iC = ((ma.f) this.f27979d).c(context, iB);
            }
            sparseIntArray2.put(iB, iC);
        }
        return iC;
    }

    public void n(Status status, boolean z5) {
        HashMap map;
        HashMap map2;
        Map map3 = (Map) this.f27978c;
        synchronized (map3) {
            map = new HashMap(map3);
        }
        Map map4 = (Map) this.f27979d;
        synchronized (map4) {
            map2 = new HashMap(map4);
        }
        for (Map.Entry entry : map.entrySet()) {
            if (z5 || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).E(status);
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (z5 || ((Boolean) entry2.getValue()).booleanValue()) {
                ((sb.g) entry2.getKey()).c(new na.d(status));
            }
        }
    }

    public void o() {
        l1 l1Var = (l1) ((k2) this.f27979d).f15951b;
        z0 z0Var = l1Var.f30264f;
        l1.h(z0Var);
        SparseArray sparseArrayI = z0Var.I();
        o3 o3Var = (o3) this.f27978c;
        sparseArrayI.put(o3Var.f30332d, Long.valueOf(o3Var.f30331c));
        z0 z0Var2 = l1Var.f30264f;
        l1.h(z0Var2);
        int[] iArr = new int[sparseArrayI.size()];
        long[] jArr = new long[sparseArrayI.size()];
        for (int i = 0; i < sparseArrayI.size(); i++) {
            iArr[i] = sparseArrayI.keyAt(i);
            jArr[i] = ((Long) sparseArrayI.valueAt(i)).longValue();
        }
        Bundle bundle = new Bundle();
        bundle.putIntArray("uriSources", iArr);
        bundle.putLongArray("uriTimestamps", jArr);
        z0Var2.f30589o.P(bundle);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        ((Map) ((i) this.f27979d).f27979d).remove((sb.g) this.f27978c);
    }

    @Override // ed.b, k0.c
    public void onFailure(Throwable th2) {
        int i = 2;
        switch (this.f27977b) {
            case 14:
                o3 o3Var = (o3) this.f27978c;
                k2 k2Var = (k2) this.f27979d;
                k2Var.C();
                k2Var.f30223j = false;
                l1 l1Var = (l1) k2Var.f15951b;
                ob.g gVar = l1Var.f30263e;
                s0 s0Var = l1Var.f30265g;
                if (gVar.M(null, ob.d0.T0)) {
                    String message = th2.getMessage();
                    k2Var.f30228o = false;
                    if (message != null) {
                        if ((th2 instanceof IllegalStateException) || message.contains("garbage collected") || th2.getClass().getSimpleName().equals("ServiceUnavailableException")) {
                            if (message.contains("Background")) {
                                k2Var.f30228o = true;
                            }
                            i = 1;
                        } else if ((th2 instanceof SecurityException) && !message.endsWith("READ_DEVICE_CONFIG")) {
                            i = 3;
                        }
                    }
                }
                int i10 = i - 1;
                if (i10 == 0) {
                    l1.k(s0Var);
                    s0Var.f30413j.h(s0.K(l1Var.q().I()), "registerTriggerAsync failed with retriable error. Will try later. App ID, throwable", s0.K(th2.toString()));
                    k2Var.f30224k = 1;
                    k2Var.a0().add(o3Var);
                } else if (i10 == 1) {
                    k2Var.a0().add(o3Var);
                    if (k2Var.f30224k <= ((Integer) ob.d0.f30049w0.a(null)).intValue()) {
                        l1.k(s0Var);
                        s0Var.f30413j.i("registerTriggerAsync failed. App ID, delay in seconds, throwable", s0.K(l1Var.q().I()), s0.K(String.valueOf(k2Var.f30224k)), s0.K(th2.toString()));
                        int i11 = k2Var.f30224k;
                        if (k2Var.f30225l == null) {
                            k2Var.f30225l = new a2(k2Var, l1Var, 1);
                        }
                        k2Var.f30225l.b(((long) i11) * 1000);
                        int i12 = k2Var.f30224k;
                        k2Var.f30224k = i12 + i12;
                    } else {
                        k2Var.f30224k = 1;
                        l1.k(s0Var);
                        s0Var.f30413j.h(s0.K(l1Var.q().I()), "registerTriggerAsync failed. May try later. App ID, throwable", s0.K(th2.toString()));
                    }
                } else {
                    l1.k(s0Var);
                    s0Var.f30411g.h(s0.K(l1Var.q().I()), "registerTriggerAsync failed. Dropping URI. App ID, Throwable", th2);
                    o();
                    k2Var.f30224k = 1;
                    k2Var.b0();
                }
                break;
            case 25:
                int i13 = ((q0.m) this.f27978c).f31599f;
                if (i13 == 2 && (th2 instanceof CancellationException)) {
                    com.google.android.gms.internal.auth.g.e("SurfaceProcessorNode", "Downstream VideoCapture failed to provide Surface.");
                } else {
                    com.google.android.gms.internal.auth.g.P("SurfaceProcessorNode", "Downstream node failed to provide Surface. Target: " + hl.l.j(i13), th2);
                }
                break;
            default:
                int i14 = ((q0.m) this.f27978c).f31599f;
                if (i14 == 2 && (th2 instanceof CancellationException)) {
                    com.google.android.gms.internal.auth.g.e("DualSurfaceProcessorNode", "Downstream VideoCapture failed to provide Surface.");
                } else {
                    com.google.android.gms.internal.auth.g.P("DualSurfaceProcessorNode", "Downstream node failed to provide Surface. Target: " + hl.l.j(i14), th2);
                }
                break;
        }
    }

    @Override // ii.o
    public void onMethodCall(n call, p callback) {
        hi.g gVar;
        qh.b bVar = (qh.b) this.f27979d;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(callback, "result");
        if (!(call.f21316b instanceof Map)) {
            throw new IllegalArgumentException("Map arguments expected");
        }
        bVar.getClass();
        AtomicBoolean atomicBoolean = bVar.f32114c;
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (!atomicBoolean.compareAndSet(true, false) && (gVar = bVar.f32113b) != null) {
            gVar.success("dev.fluttercommunity.plus/share/unavailable");
        }
        String str = SharePlusPendingIntent.f15779a;
        Intrinsics.checkNotNullParameter("", "<set-?>");
        SharePlusPendingIntent.f15779a = "";
        atomicBoolean.set(false);
        bVar.f32113b = (hi.g) callback;
        try {
            if (!call.f21315a.equals("share")) {
                ((hi.g) callback).a();
                return;
            }
            a1.m mVar = (a1.m) this.f27978c;
            Object obj = call.f21316b;
            Intrinsics.b(obj);
            mVar.t((Map) obj);
        } catch (Throwable th2) {
            atomicBoolean.set(true);
            bVar.f32113b = null;
            ((hi.g) callback).b("Share failed", th2.getMessage(), th2);
        }
    }

    @Override // ed.b, k0.c
    public void onSuccess(Object obj) {
        switch (this.f27977b) {
            case 14:
                k2 k2Var = (k2) this.f27979d;
                k2Var.C();
                o();
                k2Var.f30223j = false;
                k2Var.f30224k = 1;
                s0 s0Var = ((l1) k2Var.f15951b).f30265g;
                l1.k(s0Var);
                s0Var.f30417n.g(((o3) this.f27978c).f30330b, "Successfully registered trigger URI");
                k2Var.b0();
                break;
            case 25:
                q0.n nVar = (q0.n) obj;
                nVar.getClass();
                q0.f fVar = (q0.f) ((bb.e) this.f27979d).f2019c;
                if (!fVar.f31570f.get()) {
                    m3.c0 c0Var = new m3.c0(15, fVar, nVar);
                    Objects.requireNonNull(nVar);
                    fVar.b(c0Var, new lp(19, nVar));
                } else {
                    nVar.close();
                }
                break;
            default:
                q0.n nVar2 = (q0.n) obj;
                nVar2.getClass();
                r0.d dVar = (r0.d) ((a1.m) this.f27979d).f362b;
                if (!dVar.f32152h.get()) {
                    m3.c0 c0Var2 = new m3.c0(21, dVar, nVar2);
                    Objects.requireNonNull(nVar2);
                    dVar.b(c0Var2, new lp(19, nVar2));
                } else {
                    nVar2.close();
                }
                break;
        }
    }

    public String toString() {
        switch (this.f27977b) {
            case 17:
                return ((Map) this.f27978c).toString();
            case 21:
                StringBuilder sb2 = new StringBuilder(100);
                sb2.append(this.f27979d.getClass().getSimpleName());
                sb2.append('{');
                ArrayList arrayList = (ArrayList) this.f27978c;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    sb2.append((String) arrayList.get(i));
                    if (i < size - 1) {
                        sb2.append(", ");
                    }
                }
                sb2.append('}');
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ i(int i, Object obj, Object obj2) {
        this.f27977b = i;
        this.f27978c = obj;
        this.f27979d = obj2;
    }

    public /* synthetic */ i(int i, Object obj, Object obj2, boolean z5) {
        this.f27977b = i;
        this.f27978c = obj2;
        this.f27979d = obj;
    }

    public i(IBinder iBinder) throws RemoteException {
        this.f27977b = 1;
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (Objects.equals(interfaceDescriptor, "android.os.IMessenger")) {
            this.f27978c = new Messenger(iBinder);
            this.f27979d = null;
        } else if (Objects.equals(interfaceDescriptor, "com.google.android.gms.iid.IMessengerCompat")) {
            this.f27979d = new la.g(iBinder);
            this.f27978c = null;
        } else {
            Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
            throw new RemoteException();
        }
    }

    public /* synthetic */ i(Object obj) {
        this.f27977b = 21;
        this.f27979d = obj;
        this.f27978c = new ArrayList();
    }

    public i(String str, rl.b bVar, l7.b bVar2) {
        this.f27977b = 6;
        this.f27979d = str;
        this.f27978c = bVar;
    }

    public i(i iVar, sb.g gVar) {
        this.f27977b = 12;
        this.f27978c = gVar;
        Objects.requireNonNull(iVar);
        this.f27979d = iVar;
    }

    public i(a1.m share, qh.b manager) {
        this.f27977b = 28;
        Intrinsics.checkNotNullParameter(share, "share");
        Intrinsics.checkNotNullParameter(manager, "manager");
        this.f27978c = share;
        this.f27979d = manager;
    }

    public i(ji0 pigeonRegistrar) {
        this.f27977b = 7;
        Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
        this.f27978c = pigeonRegistrar;
        this.f27979d = new HashMap();
    }

    public i(int i) {
        this.f27977b = i;
        switch (i) {
            case 8:
                this.f27978c = (ImageCaptureFailedForSpecificCombinationQuirk) n0.a.f28964a.i(ImageCaptureFailedForSpecificCombinationQuirk.class);
                this.f27979d = (PreviewGreenTintQuirk) n0.a.f28964a.i(PreviewGreenTintQuirk.class);
                break;
            case 10:
                this.f27978c = Collections.synchronizedMap(new WeakHashMap());
                this.f27979d = Collections.synchronizedMap(new WeakHashMap());
                break;
            case 18:
                break;
            case 23:
                ma.f fVar = ma.f.f28773d;
                this.f27978c = new SparseIntArray();
                this.f27979d = fVar;
                break;
            default:
                this.f27978c = new d0();
                this.f27979d = new w7.j();
                j(t.T1);
                break;
        }
    }

    public i(File file) {
        this.f27977b = 3;
        this.f27978c = file;
        this.f27979d = new File(file.getPath() + ".bak");
    }

    public i(Map map) {
        this.f27977b = 17;
        this.f27979d = qe.b.f32105a;
        this.f27978c = map;
    }

    public i(Context context, p3.g gVar) {
        this.f27977b = 19;
        this.f27978c = context.getApplicationContext();
        this.f27979d = gVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(Context context, int i) {
        this(context, new p6(2));
        this.f27977b = i;
        switch (i) {
            case 19:
                break;
            case 22:
                c0.i(context);
                Resources resources = context.getResources();
                this.f27978c = resources;
                this.f27979d = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
                break;
            default:
                this.f27978c = context;
                break;
        }
    }

    public i(pf.a aVar) {
        this.f27977b = 26;
        this.f27978c = aVar;
        this.f27979d = new AtomicBoolean(false);
    }
}
