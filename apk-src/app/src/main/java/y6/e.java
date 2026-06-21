package y6;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f36499d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f36500e;

    public /* synthetic */ e(m mVar, int i) {
        this.f36499d = i;
        this.f36500e = mVar;
    }

    @Override // y6.h
    public void onPageScrollStateChanged(int i) {
        switch (this.f36499d) {
            case 0:
                if (i == 0) {
                    ((m) this.f36500e).d();
                    return;
                }
                return;
            case 1:
            default:
                super.onPageScrollStateChanged(i);
                return;
            case 2:
                try {
                    Iterator it = ((ArrayList) this.f36500e).iterator();
                    while (it.hasNext()) {
                        ((h) it.next()).onPageScrollStateChanged(i);
                        break;
                    }
                    return;
                } catch (ConcurrentModificationException e3) {
                    throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e3);
                }
        }
    }

    @Override // y6.h
    public void onPageScrolled(int i, float f10, int i10) {
        switch (this.f36499d) {
            case 2:
                try {
                    Iterator it = ((ArrayList) this.f36500e).iterator();
                    while (it.hasNext()) {
                        ((h) it.next()).onPageScrolled(i, f10, i10);
                        break;
                    }
                    return;
                } catch (ConcurrentModificationException e3) {
                    throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e3);
                }
            default:
                super.onPageScrolled(i, f10, i10);
                return;
        }
    }

    @Override // y6.h
    public final void onPageSelected(int i) {
        switch (this.f36499d) {
            case 0:
                m mVar = (m) this.f36500e;
                if (mVar.f36510e != i) {
                    mVar.f36510e = i;
                    mVar.f36525u.x();
                    return;
                }
                return;
            case 1:
                m mVar2 = (m) this.f36500e;
                mVar2.clearFocus();
                if (mVar2.hasFocus()) {
                    mVar2.f36515k.requestFocus(2);
                    return;
                }
                return;
            default:
                try {
                    Iterator it = ((ArrayList) this.f36500e).iterator();
                    while (it.hasNext()) {
                        ((h) it.next()).onPageSelected(i);
                        break;
                    }
                    return;
                } catch (ConcurrentModificationException e3) {
                    throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e3);
                }
        }
    }

    public e() {
        this.f36499d = 2;
        this.f36500e = new ArrayList(3);
    }
}
