package ac;

import android.app.Notification;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.work.impl.foreground.SystemForegroundService;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import k0.j;
import k0.m;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f733c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f734d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f735e;

    public /* synthetic */ a(Object obj, int i, Object obj2, int i10) {
        this.f732b = i10;
        this.f735e = obj;
        this.f733c = i;
        this.f734d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j1.h hVar;
        ArrayList arrayList;
        int iDecrementAndGet;
        switch (this.f732b) {
            case 0:
                ((BottomSheetBehavior) this.f735e).C((View) this.f734d, this.f733c, false);
                return;
            case 1:
                m mVar = (m) this.f735e;
                int i = this.f733c;
                ed.d dVar = (ed.d) this.f734d;
                boolean z5 = mVar.f26782d;
                AtomicInteger atomicInteger = mVar.f26783e;
                ArrayList arrayList2 = mVar.f26781c;
                if (mVar.isDone() || arrayList2 == null) {
                    f2.g.h("Future was done before all dependencies completed", z5);
                    return;
                }
                try {
                    try {
                        try {
                            try {
                                f2.g.h("Tried to set value from future which is not done", dVar.isDone());
                                arrayList2.set(i, j.d(dVar));
                                iDecrementAndGet = atomicInteger.decrementAndGet();
                                f2.g.h("Less than 0 remaining futures", iDecrementAndGet >= 0);
                            } catch (CancellationException unused) {
                                if (z5) {
                                    mVar.cancel(false);
                                }
                                int iDecrementAndGet2 = atomicInteger.decrementAndGet();
                                f2.g.h("Less than 0 remaining futures", iDecrementAndGet2 >= 0);
                                if (iDecrementAndGet2 == 0) {
                                    ArrayList arrayList3 = mVar.f26781c;
                                    if (arrayList3 != null) {
                                        hVar = mVar.f26785g;
                                        arrayList = new ArrayList(arrayList3);
                                    }
                                    f2.g.h(null, mVar.isDone());
                                    return;
                                }
                                return;
                            } catch (ExecutionException e3) {
                                if (z5) {
                                    mVar.f26785g.d(e3.getCause());
                                }
                                int iDecrementAndGet3 = atomicInteger.decrementAndGet();
                                f2.g.h("Less than 0 remaining futures", iDecrementAndGet3 >= 0);
                                if (iDecrementAndGet3 == 0) {
                                    ArrayList arrayList4 = mVar.f26781c;
                                    if (arrayList4 != null) {
                                        hVar = mVar.f26785g;
                                        arrayList = new ArrayList(arrayList4);
                                    }
                                    f2.g.h(null, mVar.isDone());
                                    return;
                                }
                                return;
                            }
                        } catch (RuntimeException e7) {
                            if (z5) {
                                mVar.f26785g.d(e7);
                            }
                            int iDecrementAndGet4 = atomicInteger.decrementAndGet();
                            f2.g.h("Less than 0 remaining futures", iDecrementAndGet4 >= 0);
                            if (iDecrementAndGet4 == 0) {
                                ArrayList arrayList5 = mVar.f26781c;
                                if (arrayList5 != null) {
                                    hVar = mVar.f26785g;
                                    arrayList = new ArrayList(arrayList5);
                                }
                                f2.g.h(null, mVar.isDone());
                                return;
                            }
                            return;
                        }
                    } catch (Error e10) {
                        mVar.f26785g.d(e10);
                        int iDecrementAndGet5 = atomicInteger.decrementAndGet();
                        f2.g.h("Less than 0 remaining futures", iDecrementAndGet5 >= 0);
                        if (iDecrementAndGet5 == 0) {
                            ArrayList arrayList6 = mVar.f26781c;
                            if (arrayList6 != null) {
                                hVar = mVar.f26785g;
                                arrayList = new ArrayList(arrayList6);
                            }
                            f2.g.h(null, mVar.isDone());
                            return;
                        }
                        return;
                    }
                    if (iDecrementAndGet == 0) {
                        ArrayList arrayList7 = mVar.f26781c;
                        if (arrayList7 != null) {
                            hVar = mVar.f26785g;
                            arrayList = new ArrayList(arrayList7);
                            hVar.b(arrayList);
                            return;
                        }
                        f2.g.h(null, mVar.isDone());
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    int iDecrementAndGet6 = atomicInteger.decrementAndGet();
                    f2.g.h("Less than 0 remaining futures", iDecrementAndGet6 >= 0);
                    if (iDecrementAndGet6 == 0) {
                        ArrayList arrayList8 = mVar.f26781c;
                        if (arrayList8 != null) {
                            mVar.f26785g.b(new ArrayList(arrayList8));
                        } else {
                            f2.g.h(null, mVar.isDone());
                        }
                    }
                    throw th2;
                }
            case 2:
                ((TextView) this.f734d).setTypeface((Typeface) this.f735e, this.f733c);
                return;
            case 3:
                ((o7.g) this.f734d).a(this.f733c, (Intent) this.f735e);
                return;
            case 4:
                ((q.f) this.f735e).f31542c.e(this.f733c, (Bundle) this.f734d);
                return;
            default:
                ((SystemForegroundService) this.f735e).f1788f.notify(this.f733c, (Notification) this.f734d);
                return;
        }
    }

    public /* synthetic */ a(Object obj, Object obj2, int i, int i10) {
        this.f732b = i10;
        this.f734d = obj;
        this.f735e = obj2;
        this.f733c = i;
    }

    public a(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
        this.f732b = 0;
        this.f735e = bottomSheetBehavior;
        this.f734d = view;
        this.f733c = i;
    }
}
