package yads;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class nj0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final op2 f41259h = new op2(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kj0 f41260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArraySet f41261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f41262c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f41263d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f41264e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f41265f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List f41266g;

    public nj0(Context context, rc0 rc0Var, sc0 sc0Var) {
        context.getApplicationContext();
        this.f41263d = true;
        this.f41266g = Collections.EMPTY_LIST;
        this.f41261b = new CopyOnWriteArraySet();
        Handler handlerB = lb3.b(new m3.j(2, this));
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:DownloadManager");
        handlerThread.start();
        kj0 kj0Var = new kj0(handlerThread, rc0Var, sc0Var, handlerB, this.f41263d);
        this.f41260a = kj0Var;
        int iC = new sp2(context, new yi.f0(8, this)).c();
        this.f41264e = iC;
        this.f41262c = 1;
        kj0Var.obtainMessage(0, iC, 0).sendToTarget();
    }

    public final boolean a(Message message) {
        int i = message.what;
        if (i == 0) {
            this.f41266g = Collections.unmodifiableList((List) message.obj);
            boolean zA = a();
            Iterator it = this.f41261b.iterator();
            while (it.hasNext()) {
                ((lj0) it.next()).getClass();
            }
            if (zA) {
                Iterator it2 = this.f41261b.iterator();
                while (it2.hasNext()) {
                    ((lj0) it2.next()).getClass();
                }
            }
        } else if (i == 1) {
            int i10 = message.arg1;
            int i11 = message.arg2;
            int i12 = this.f41262c - i10;
            this.f41262c = i12;
            if (i11 == 0 && i12 == 0) {
                Iterator it3 = this.f41261b.iterator();
                while (it3.hasNext()) {
                    ((lj0) it3.next()).getClass();
                }
            }
        } else {
            if (i != 2) {
                throw new IllegalStateException();
            }
            jj0 jj0Var = (jj0) message.obj;
            this.f41266g = Collections.unmodifiableList(jj0Var.f39876c);
            hj0 hj0Var = jj0Var.f39874a;
            boolean zA2 = a();
            if (jj0Var.f39875b) {
                Iterator it4 = this.f41261b.iterator();
                while (it4.hasNext()) {
                    ((lj0) it4.next()).getClass();
                }
            } else {
                Iterator it5 = this.f41261b.iterator();
                while (it5.hasNext()) {
                    un3 un3Var = (un3) ((lj0) it5.next());
                    un3Var.getClass();
                    if (Intrinsics.a(hj0Var.f39211a.f42316b, un3Var.f43740a)) {
                        if (un3.f43737d.contains(Integer.valueOf(hj0Var.f39212b))) {
                            nm2 nm2Var = un3Var.f43741b;
                            dk.i iVar = un3.f43736c[0];
                            ch3 ch3Var = (ch3) nm2Var.f41294a.get();
                            if (ch3Var != null) {
                                ch3Var.a();
                            }
                        }
                        if (un3.f43738e.contains(Integer.valueOf(hj0Var.f39212b))) {
                            nm2 nm2Var2 = un3Var.f43741b;
                            dk.i iVar2 = un3.f43736c[0];
                            ch3 ch3Var2 = (ch3) nm2Var2.f41294a.get();
                            if (ch3Var2 != null) {
                                ch3Var2.c();
                            }
                        }
                        if (un3.f43739f.contains(Integer.valueOf(hj0Var.f39212b))) {
                            this.f41261b.remove(un3Var);
                        }
                    }
                }
            }
            if (zA2) {
                Iterator it6 = this.f41261b.iterator();
                while (it6.hasNext()) {
                    ((lj0) it6.next()).getClass();
                }
            }
        }
        return true;
    }

    public final void a(sp2 sp2Var, int i) {
        op2 op2Var = sp2Var.f43040c;
        if (this.f41264e != i) {
            this.f41264e = i;
            this.f41262c++;
            this.f41260a.obtainMessage(2, i, 0).sendToTarget();
        }
        boolean zA = a();
        Iterator it = this.f41261b.iterator();
        while (it.hasNext()) {
            ((lj0) it.next()).getClass();
        }
        if (zA) {
            Iterator it2 = this.f41261b.iterator();
            while (it2.hasNext()) {
                ((lj0) it2.next()).getClass();
            }
        }
    }

    public final boolean a() {
        boolean z5;
        if (this.f41263d || this.f41264e == 0) {
            z5 = false;
        } else {
            for (int i = 0; i < this.f41266g.size(); i++) {
                if (((hj0) this.f41266g.get(i)).f39212b == 0) {
                    z5 = true;
                    break;
                }
            }
            z5 = false;
        }
        boolean z10 = this.f41265f != z5;
        this.f41265f = z5;
        return z10;
    }
}
