package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class es1 implements Iterator, Closeable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final nb f5059h = new nb("eof ", 1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ib f5060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ly f5061c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public kb f5062d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f5063e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f5064f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f5065g = new ArrayList();

    static {
        fs1.w(es1.class);
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final kb next() {
        kb kbVarA;
        kb kbVar = this.f5062d;
        if (kbVar != null && kbVar != f5059h) {
            this.f5062d = null;
            return kbVar;
        }
        ly lyVar = this.f5061c;
        if (lyVar == null || this.f5063e >= this.f5064f) {
            this.f5062d = f5059h;
            throw new NoSuchElementException();
        }
        try {
            synchronized (lyVar) {
                this.f5061c.f7674b.position((int) this.f5063e);
                kbVarA = ((hb) this.f5060b).a(this.f5061c, this);
                this.f5063e = this.f5061c.b();
            }
            return kbVarA;
        } catch (EOFException unused) {
            throw new NoSuchElementException();
        } catch (IOException unused2) {
            throw new NoSuchElementException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        kb kbVar = this.f5062d;
        nb nbVar = f5059h;
        if (kbVar == nbVar) {
            return false;
        }
        if (kbVar != null) {
            return true;
        }
        try {
            this.f5062d = next();
            return true;
        } catch (NoSuchElementException unused) {
            this.f5062d = nbVar;
            return false;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append("[");
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f5065g;
            if (i >= arrayList.size()) {
                sb2.append("]");
                return sb2.toString();
            }
            if (i > 0) {
                sb2.append(";");
            }
            sb2.append(((kb) arrayList.get(i)).toString());
            i++;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
