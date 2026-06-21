package yads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class rf1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xv f42586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l53 f42587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final pf1 f42588c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArraySet f42589d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayDeque f42590e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayDeque f42591f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f42592g;

    public rf1(Looper looper, xv xvVar, pf1 pf1Var) {
        this(new CopyOnWriteArraySet(), looper, xvVar, pf1Var);
    }

    public final void a() {
        if (this.f42591f.isEmpty()) {
            return;
        }
        if (!this.f42587b.f40427a.hasMessages(0)) {
            l53 l53Var = this.f42587b;
            l53Var.getClass();
            k53 k53VarA = l53.a();
            Message messageObtainMessage = l53Var.f40427a.obtainMessage(0);
            k53VarA.f40078a = messageObtainMessage;
            Handler handler = l53Var.f40427a;
            messageObtainMessage.getClass();
            handler.sendMessageAtFrontOfQueue(messageObtainMessage);
            k53VarA.a();
        }
        boolean zIsEmpty = this.f42590e.isEmpty();
        this.f42590e.addAll(this.f42591f);
        this.f42591f.clear();
        if (zIsEmpty) {
            while (!this.f42590e.isEmpty()) {
                ((Runnable) this.f42590e.peekFirst()).run();
                this.f42590e.removeFirst();
            }
        }
    }

    public rf1(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, xv xvVar, pf1 pf1Var) {
        this.f42586a = xvVar;
        this.f42589d = copyOnWriteArraySet;
        this.f42588c = pf1Var;
        this.f42590e = new ArrayDeque();
        this.f42591f = new ArrayDeque();
        this.f42587b = ((i53) xvVar).a(looper, new m3.j(3, this));
    }

    public final boolean a(Message message) {
        for (qf1 qf1Var : this.f42589d) {
            pf1 pf1Var = this.f42588c;
            if (!qf1Var.f42292d && qf1Var.f42291c) {
                ew0 ew0VarA = qf1Var.f42290b.a();
                qf1Var.f42290b = new dw0();
                qf1Var.f42291c = false;
                pf1Var.a(qf1Var.f42289a, ew0VarA);
            }
            if (this.f42587b.f40427a.hasMessages(0)) {
                return true;
            }
        }
        return true;
    }

    public static void a(CopyOnWriteArraySet copyOnWriteArraySet, int i, of1 of1Var) {
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            qf1 qf1Var = (qf1) it.next();
            if (!qf1Var.f42292d) {
                if (i != -1) {
                    qf1Var.f42290b.a(i);
                }
                qf1Var.f42291c = true;
                of1Var.invoke(qf1Var.f42289a);
            }
        }
    }

    public final void a(int i, of1 of1Var) {
        this.f42591f.add(new d.l(new CopyOnWriteArraySet(this.f42589d), i, of1Var, 12));
    }
}
