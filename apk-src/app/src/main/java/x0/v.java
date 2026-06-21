package x0;

import a0.b1;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.om1;
import com.google.android.gms.internal.ads.r9;
import com.google.android.gms.internal.ads.y2;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.vk.api.sdk.VK;
import com.vk.api.sdk.VKApiCallback;
import com.vk.api.sdk.auth.VKScope;
import io.flutter.view.FlutterCallbackInformation;
import io.sentry.protocol.FeatureFlags;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import t.v0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class v implements k0.c, q4.f, x5.r, OnCompleteListener, xh.y, VKApiCallback, z3.s {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static v f35679e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f35680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f35681c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f35682d;

    public /* synthetic */ v(int i, Object obj) {
        this.f35680b = i;
        this.f35681c = obj;
        this.f35682d = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0047 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0042 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static x0.v h(android.content.Context r5) {
        /*
            java.lang.String r0 = "generatefid.lock"
            r1 = 0
            java.io.File r2 = new java.io.File     // Catch: java.nio.channels.OverlappingFileLockException -> L31 java.lang.Error -> L35 java.io.IOException -> L37
            java.io.File r5 = r5.getFilesDir()     // Catch: java.nio.channels.OverlappingFileLockException -> L31 java.lang.Error -> L35 java.io.IOException -> L37
            r2.<init>(r5, r0)     // Catch: java.nio.channels.OverlappingFileLockException -> L31 java.lang.Error -> L35 java.io.IOException -> L37
            java.io.RandomAccessFile r5 = new java.io.RandomAccessFile     // Catch: java.nio.channels.OverlappingFileLockException -> L31 java.lang.Error -> L35 java.io.IOException -> L37
            java.lang.String r0 = "rw"
            r5.<init>(r2, r0)     // Catch: java.nio.channels.OverlappingFileLockException -> L31 java.lang.Error -> L35 java.io.IOException -> L37
            java.nio.channels.FileChannel r5 = r5.getChannel()     // Catch: java.nio.channels.OverlappingFileLockException -> L31 java.lang.Error -> L35 java.io.IOException -> L37
            java.nio.channels.FileLock r0 = r5.lock()     // Catch: java.nio.channels.OverlappingFileLockException -> L2a java.lang.Error -> L2d java.io.IOException -> L2f
            x0.v r2 = new x0.v     // Catch: java.nio.channels.OverlappingFileLockException -> L24 java.lang.Error -> L26 java.io.IOException -> L28
            r3 = 13
            r4 = 0
            r2.<init>(r3, r5, r0, r4)     // Catch: java.nio.channels.OverlappingFileLockException -> L24 java.lang.Error -> L26 java.io.IOException -> L28
            return r2
        L24:
            r2 = move-exception
            goto L39
        L26:
            r2 = move-exception
            goto L39
        L28:
            r2 = move-exception
            goto L39
        L2a:
            r2 = move-exception
        L2b:
            r0 = r1
            goto L39
        L2d:
            r2 = move-exception
            goto L2b
        L2f:
            r2 = move-exception
            goto L2b
        L31:
            r2 = move-exception
        L32:
            r5 = r1
            r0 = r5
            goto L39
        L35:
            r2 = move-exception
            goto L32
        L37:
            r2 = move-exception
            goto L32
        L39:
            java.lang.String r3 = "CrossProcessLock"
            java.lang.String r4 = "encountered error while creating and acquiring the lock, ignoring"
            android.util.Log.e(r3, r4, r2)
            if (r0 == 0) goto L45
            r0.release()     // Catch: java.io.IOException -> L45
        L45:
            if (r5 == 0) goto L4a
            r5.close()     // Catch: java.io.IOException -> L4a
        L4a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.v.h(android.content.Context):x0.v");
    }

    @Override // z3.s
    public m4.p a(z3.o oVar, z3.l lVar) {
        return new a1.e(9, ((z3.s) this.f35681c).a(oVar, lVar), (List) this.f35682d, false);
    }

    @Override // x5.r
    public void c(m3.p pVar) {
        x5.t tVar = (x5.t) this.f35682d;
        SparseArray sparseArray = tVar.f35962h;
        y2 y2Var = (y2) this.f35681c;
        if (pVar.z() == 0 && (pVar.z() & 128) != 0) {
            pVar.N(6);
            int iA = pVar.a() / 4;
            for (int i = 0; i < iA; i++) {
                pVar.k(y2Var.f12462b, 0, 4);
                y2Var.q(0);
                int i10 = y2Var.i(16);
                y2Var.t(3);
                if (i10 == 0) {
                    y2Var.t(13);
                } else {
                    int i11 = y2Var.i(13);
                    if (sparseArray.get(i11) == null) {
                        sparseArray.put(i11, new x5.s(new d1.b(tVar, i11)));
                        tVar.f35967n++;
                    }
                }
            }
            if (tVar.f35955a != 2) {
                sparseArray.remove(0);
            }
        }
    }

    @Override // xh.y
    public void d(KeyEvent keyEvent, ac.c cVar) {
        int action = keyEvent.getAction();
        if (action != 0 && action != 1) {
            cVar.h(false);
            return;
        }
        Character chD = ((l7.n) this.f35682d).d(keyEvent.getUnicodeChar());
        boolean z5 = action != 0;
        b1 b1Var = (b1) this.f35681c;
        s3.q qVar = new s3.q(24, cVar);
        s7.g gVar = (s7.g) b1Var.f45c;
        HashMap map = new HashMap();
        map.put("type", z5 ? "keyup" : "keydown");
        map.put("keymap", "android");
        map.put(FeatureFlags.TYPE, Integer.valueOf(keyEvent.getFlags()));
        map.put("plainCodePoint", Integer.valueOf(keyEvent.getUnicodeChar(0)));
        map.put("codePoint", Integer.valueOf(keyEvent.getUnicodeChar()));
        map.put("keyCode", Integer.valueOf(keyEvent.getKeyCode()));
        map.put("scanCode", Integer.valueOf(keyEvent.getScanCode()));
        map.put("metaState", Integer.valueOf(keyEvent.getMetaState()));
        map.put("character", chD.toString());
        map.put("source", Integer.valueOf(keyEvent.getSource()));
        map.put("deviceId", Integer.valueOf(keyEvent.getDeviceId()));
        map.put("repeatCount", Integer.valueOf(keyEvent.getRepeatCount()));
        gVar.K(map, new he.e(1, qVar));
    }

    @Override // z3.s
    public m4.p e() {
        return new a1.e(9, ((z3.s) this.f35681c).e(), (List) this.f35682d, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x011c A[EDGE_INSN: B:68:0x011c->B:52:0x011c BREAK  A[LOOP:1: B:38:0x00e3->B:51:0x010b], SYNTHETIC] */
    @Override // q4.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public q4.e f(q4.l r17, long r18) {
        /*
            Method dump skipped, instruction units count: 305
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.v.f(q4.l, long):q4.e");
    }

    @Override // com.vk.api.sdk.VKApiCallback
    public void fail(Exception error) {
        Intrinsics.checkNotNullParameter(error, "error");
        String message = om1.k("Get profile permissions error: ", error.getMessage());
        String strValueOf = String.valueOf(error.getMessage());
        yl.d error2 = new yl.d(0, strValueOf);
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(error2, "error");
        Intrinsics.checkNotNullParameter(error2, "error");
        HashMap mapF = kotlin.collections.j0.f(new Pair("apiCode", 0), new Pair("message", strValueOf));
        Intrinsics.checkNotNullParameter("API_ERROR", "code");
        ((hi.g) this.f35682d).b("API_ERROR", message, mapF);
    }

    @Override // q4.f
    public void g() {
        m3.p pVar = (m3.p) this.f35682d;
        byte[] bArr = m3.z.f28609b;
        pVar.getClass();
        pVar.K(bArr.length, bArr);
    }

    public void i(z2.t f10, boolean z5) {
        Intrinsics.checkNotNullParameter(f10, "f");
        z2.t tVar = ((z2.h0) this.f35681c).f45864x;
        if (tVar != null) {
            z2.h0 h0VarN = tVar.n();
            Intrinsics.checkNotNullExpressionValue(h0VarN, "parent.getParentFragmentManager()");
            h0VarN.f45854n.i(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f35682d).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z5) {
                throw null;
            }
            throw null;
        }
    }

    public void j(z2.t f10, boolean z5) {
        Intrinsics.checkNotNullParameter(f10, "f");
        z2.h0 h0Var = (z2.h0) this.f35681c;
        z2.w wVar = h0Var.f45862v.f45996d;
        z2.t tVar = h0Var.f45864x;
        if (tVar != null) {
            z2.h0 h0VarN = tVar.n();
            Intrinsics.checkNotNullExpressionValue(h0VarN, "parent.getParentFragmentManager()");
            h0VarN.f45854n.j(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f35682d).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z5) {
                throw null;
            }
            throw null;
        }
    }

    public void k(z2.t f10, boolean z5) {
        Intrinsics.checkNotNullParameter(f10, "f");
        z2.t tVar = ((z2.h0) this.f35681c).f45864x;
        if (tVar != null) {
            z2.h0 h0VarN = tVar.n();
            Intrinsics.checkNotNullExpressionValue(h0VarN, "parent.getParentFragmentManager()");
            h0VarN.f45854n.k(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f35682d).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z5) {
                throw null;
            }
            throw null;
        }
    }

    public void l(z2.t f10, boolean z5) {
        Intrinsics.checkNotNullParameter(f10, "f");
        z2.t tVar = ((z2.h0) this.f35681c).f45864x;
        if (tVar != null) {
            z2.h0 h0VarN = tVar.n();
            Intrinsics.checkNotNullExpressionValue(h0VarN, "parent.getParentFragmentManager()");
            h0VarN.f45854n.l(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f35682d).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z5) {
                throw null;
            }
            throw null;
        }
    }

    public void m(z2.t f10, boolean z5) {
        Intrinsics.checkNotNullParameter(f10, "f");
        z2.t tVar = ((z2.h0) this.f35681c).f45864x;
        if (tVar != null) {
            z2.h0 h0VarN = tVar.n();
            Intrinsics.checkNotNullExpressionValue(h0VarN, "parent.getParentFragmentManager()");
            h0VarN.f45854n.m(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f35682d).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z5) {
                throw null;
            }
            throw null;
        }
    }

    public void n(z2.t f10, boolean z5) {
        Intrinsics.checkNotNullParameter(f10, "f");
        z2.t tVar = ((z2.h0) this.f35681c).f45864x;
        if (tVar != null) {
            z2.h0 h0VarN = tVar.n();
            Intrinsics.checkNotNullExpressionValue(h0VarN, "parent.getParentFragmentManager()");
            h0VarN.f45854n.n(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f35682d).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z5) {
                throw null;
            }
            throw null;
        }
    }

    public void o(z2.t f10, boolean z5) {
        Intrinsics.checkNotNullParameter(f10, "f");
        z2.h0 h0Var = (z2.h0) this.f35681c;
        z2.w wVar = h0Var.f45862v.f45996d;
        z2.t tVar = h0Var.f45864x;
        if (tVar != null) {
            z2.h0 h0VarN = tVar.n();
            Intrinsics.checkNotNullExpressionValue(h0VarN, "parent.getParentFragmentManager()");
            h0VarN.f45854n.o(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f35682d).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z5) {
                throw null;
            }
            throw null;
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        xc.c cVar = (xc.c) this.f35681c;
        sb.g gVar = (sb.g) this.f35682d;
        synchronized (cVar.f36065f) {
            cVar.f36064e.remove(gVar);
        }
    }

    @Override // k0.c
    public void onFailure(Throwable th2) {
        h hVar;
        com.google.android.gms.internal.auth.g.P("Recorder", "VideoEncoder Setup error: " + th2, th2);
        k6.o oVar = (k6.o) this.f35682d;
        int i = oVar.f27142c;
        if (i < oVar.f27140a) {
            oVar.f27142c = i + 1;
            t.a0 a0Var = new t.a0(12, this);
            oVar.f27145f = hl.d.s().schedule(new v0(14, ((b0) oVar.f27146g).f35533d, a0Var), b0.f35526u0, TimeUnit.MILLISECONDS);
            return;
        }
        b0 b0Var = (b0) oVar.f27146g;
        synchronized (b0Var.f35541h) {
            try {
                hVar = null;
                switch (b0Var.f35547l.ordinal()) {
                    case 1:
                    case 2:
                        h hVar2 = b0Var.f35552p;
                        b0Var.f35552p = null;
                        hVar = hVar2;
                    case 0:
                        b0Var.E(-1);
                        b0Var.D(a0.f35513j);
                        break;
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        throw new AssertionError("Encountered encoder setup error while in unexpected state " + b0Var.f35547l + ": " + th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (hVar != null) {
            b0Var.j(hVar, 7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0103 A[Catch: all -> 0x00c3, TryCatch #0 {all -> 0x00c3, blocks: (B:22:0x00af, B:23:0x00b5, B:51:0x0126, B:25:0x00ba, B:28:0x00c6, B:31:0x00cc, B:32:0x00d3, B:35:0x00d7, B:36:0x00e4, B:37:0x00f7, B:40:0x00fb, B:45:0x0103, B:47:0x0108, B:48:0x0113, B:49:0x011d), top: B:67:0x00af }] */
    @Override // k0.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onSuccess(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.v.onSuccess(java.lang.Object):void");
    }

    public void p(z2.t f10, boolean z5) {
        Intrinsics.checkNotNullParameter(f10, "f");
        z2.t tVar = ((z2.h0) this.f35681c).f45864x;
        if (tVar != null) {
            z2.h0 h0VarN = tVar.n();
            Intrinsics.checkNotNullExpressionValue(h0VarN, "parent.getParentFragmentManager()");
            h0VarN.f45854n.p(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f35682d).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z5) {
                throw null;
            }
            throw null;
        }
    }

    public void q(z2.t f10, boolean z5) {
        Intrinsics.checkNotNullParameter(f10, "f");
        z2.t tVar = ((z2.h0) this.f35681c).f45864x;
        if (tVar != null) {
            z2.h0 h0VarN = tVar.n();
            Intrinsics.checkNotNullExpressionValue(h0VarN, "parent.getParentFragmentManager()");
            h0VarN.f45854n.q(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f35682d).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z5) {
                throw null;
            }
            throw null;
        }
    }

    public void r(z2.t f10, Bundle outState, boolean z5) {
        Intrinsics.checkNotNullParameter(f10, "f");
        Intrinsics.checkNotNullParameter(outState, "outState");
        z2.t tVar = ((z2.h0) this.f35681c).f45864x;
        if (tVar != null) {
            z2.h0 h0VarN = tVar.n();
            Intrinsics.checkNotNullExpressionValue(h0VarN, "parent.getParentFragmentManager()");
            h0VarN.f45854n.r(f10, outState, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f35682d).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z5) {
                throw null;
            }
            throw null;
        }
    }

    public void s(z2.t f10, boolean z5) {
        Intrinsics.checkNotNullParameter(f10, "f");
        z2.t tVar = ((z2.h0) this.f35681c).f45864x;
        if (tVar != null) {
            z2.h0 h0VarN = tVar.n();
            Intrinsics.checkNotNullExpressionValue(h0VarN, "parent.getParentFragmentManager()");
            h0VarN.f45854n.s(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f35682d).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z5) {
                throw null;
            }
            throw null;
        }
    }

    @Override // com.vk.api.sdk.VKApiCallback
    public void success(Object obj) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = 0;
        String[] strArr = (String[]) ((List) this.f35681c).toArray(new String[0]);
        ArrayList scopes = yl.b.a(kotlin.collections.s.f(Arrays.copyOf(strArr, strArr.length)));
        List list = yl.c.f45758a;
        Intrinsics.checkNotNullParameter(scopes, "scopes");
        if (!scopes.isEmpty()) {
            Iterator it = scopes.iterator();
            while (it.hasNext()) {
                Integer num = (Integer) yl.c.f45759b.get((VKScope) it.next());
                if (num != null) {
                    iIntValue2 |= num.intValue();
                }
            }
            if ((iIntValue & iIntValue2) != iIntValue2) {
                VK.logout();
            }
        }
        ((hi.g) this.f35682d).success(Boolean.TRUE);
    }

    public void t(z2.t f10, boolean z5) {
        Intrinsics.checkNotNullParameter(f10, "f");
        z2.t tVar = ((z2.h0) this.f35681c).f45864x;
        if (tVar != null) {
            z2.h0 h0VarN = tVar.n();
            Intrinsics.checkNotNullExpressionValue(h0VarN, "parent.getParentFragmentManager()");
            h0VarN.f45854n.t(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f35682d).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z5) {
                throw null;
            }
            throw null;
        }
    }

    public String toString() {
        switch (this.f35680b) {
            case 14:
                StringBuilder sb2 = new StringBuilder("DartCallback( bundle path: ");
                sb2.append((String) this.f35681c);
                sb2.append(", library path: ");
                FlutterCallbackInformation flutterCallbackInformation = (FlutterCallbackInformation) this.f35682d;
                sb2.append(flutterCallbackInformation.callbackLibraryPath);
                sb2.append(", function: ");
                return a0.u.o(sb2, flutterCallbackInformation.callbackName, " )");
            default:
                return super.toString();
        }
    }

    public void u(z2.t f10, View v5, boolean z5) {
        Intrinsics.checkNotNullParameter(f10, "f");
        Intrinsics.checkNotNullParameter(v5, "v");
        z2.t tVar = ((z2.h0) this.f35681c).f45864x;
        if (tVar != null) {
            z2.h0 h0VarN = tVar.n();
            Intrinsics.checkNotNullExpressionValue(h0VarN, "parent.getParentFragmentManager()");
            h0VarN.f45854n.u(f10, v5, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f35682d).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z5) {
                throw null;
            }
            throw null;
        }
    }

    public void v(z2.t f10, boolean z5) {
        Intrinsics.checkNotNullParameter(f10, "f");
        z2.t tVar = ((z2.h0) this.f35681c).f45864x;
        if (tVar != null) {
            z2.h0 h0VarN = tVar.n();
            Intrinsics.checkNotNullExpressionValue(h0VarN, "parent.getParentFragmentManager()");
            h0VarN.f45854n.v(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f35682d).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z5) {
                throw null;
            }
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.datatransport.cct.CctBackendFactory w(java.lang.String r14) {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.v.w(java.lang.String):com.google.android.datatransport.cct.CctBackendFactory");
    }

    public MotionEvent x(xh.c0 c0Var) {
        long j10 = c0Var.f36105a;
        LongSparseArray longSparseArray = (LongSparseArray) this.f35681c;
        PriorityQueue priorityQueue = (PriorityQueue) this.f35682d;
        while (!priorityQueue.isEmpty() && ((Long) priorityQueue.peek()).longValue() < j10) {
            longSparseArray.remove(((Long) priorityQueue.poll()).longValue());
        }
        if (!priorityQueue.isEmpty() && ((Long) priorityQueue.peek()).longValue() == j10) {
            priorityQueue.poll();
        }
        MotionEvent motionEvent = (MotionEvent) longSparseArray.get(j10);
        longSparseArray.remove(j10);
        return motionEvent;
    }

    public void y() {
        try {
            ((FileLock) this.f35682d).release();
            ((FileChannel) this.f35681c).close();
        } catch (IOException e3) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e3);
        }
    }

    public /* synthetic */ v(int i, Object obj, Object obj2) {
        this.f35680b = i;
        this.f35682d = obj;
        this.f35681c = obj2;
    }

    public /* synthetic */ v(int i, Object obj, Object obj2, boolean z5) {
        this.f35680b = i;
        this.f35681c = obj;
        this.f35682d = obj2;
    }

    public v(z2.h0 fragmentManager) {
        this.f35680b = 9;
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        this.f35681c = fragmentManager;
        this.f35682d = new CopyOnWriteArrayList();
    }

    public v(b1 b1Var) {
        this.f35680b = 5;
        this.f35682d = new l7.n(13);
        this.f35681c = b1Var;
    }

    public v(int i) {
        this.f35680b = i;
        switch (i) {
            case 12:
                break;
            default:
                this.f35681c = new LongSparseArray();
                this.f35682d = new PriorityQueue();
                break;
        }
    }

    public v(m3.w wVar) {
        this.f35680b = 2;
        this.f35681c = wVar;
        this.f35682d = new m3.p();
    }

    public v(List list, yl.b bVar, hi.g gVar) {
        this.f35680b = 7;
        this.f35681c = list;
        this.f35682d = gVar;
    }

    public v(Animator animator) {
        this.f35680b = 8;
        this.f35681c = null;
        AnimatorSet animatorSet = new AnimatorSet();
        this.f35682d = animatorSet;
        animatorSet.play(animator);
    }

    public v(AssetManager assetManager, String str, FlutterCallbackInformation flutterCallbackInformation) {
        this.f35680b = 14;
        this.f35681c = str;
        this.f35682d = flutterCallbackInformation;
    }

    public v(x5.t tVar) {
        this.f35680b = 3;
        this.f35682d = tVar;
        this.f35681c = new y2(4, new byte[4]);
    }

    @Override // x5.r
    public void b(m3.w wVar, q4.m mVar, r9 r9Var) {
    }
}
