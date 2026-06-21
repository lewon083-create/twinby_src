package m;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EditText f28363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ni.i f28364b;

    public t(EditText editText) {
        this.f28363a = editText;
        this.f28364b = new ni.i(editText);
    }

    public final KeyListener a(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        ((r3.b) this.f28364b.f29407c).getClass();
        if (keyListener instanceof w2.e) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new w2.e(keyListener);
    }

    public final void b(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = this.f28363a.getContext().obtainStyledAttributes(attributeSet, h.a.f20299g, i, 0);
        try {
            boolean z5 = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            d(z5);
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    public final w2.b c(InputConnection inputConnection, EditorInfo editorInfo) {
        ni.i iVar = this.f28364b;
        if (inputConnection == null) {
            iVar.getClass();
            inputConnection = null;
        } else {
            r3.b bVar = (r3.b) iVar.f29407c;
            bVar.getClass();
            if (!(inputConnection instanceof w2.b)) {
                inputConnection = new w2.b((EditText) bVar.f32188c, inputConnection, editorInfo);
            }
        }
        return (w2.b) inputConnection;
    }

    public final void d(boolean z5) {
        w2.h hVar = (w2.h) ((r3.b) this.f28364b.f29407c).f32189d;
        if (hVar.f35017d != z5) {
            if (hVar.f35016c != null) {
                u2.h hVarA = u2.h.a();
                q2 q2Var = hVar.f35016c;
                hVarA.getClass();
                f2.g.g(q2Var, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = hVarA.f34029a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    hVarA.f34030b.remove(q2Var);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            hVar.f35017d = z5;
            if (z5) {
                w2.h.a(hVar.f35015b, u2.h.a().b());
            }
        }
    }
}
