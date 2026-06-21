package io.appmetrica.analytics.coreutils.internal.toggle;

import com.google.android.gms.internal.measurement.h5;
import ij.k;
import ij.m;
import io.appmetrica.analytics.coreapi.internal.control.Toggle;
import io.appmetrica.analytics.coreapi.internal.control.ToggleObserver;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.g0;
import org.jetbrains.annotations.NotNull;
import pe.a;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    java.lang.IllegalArgumentException: Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.
    	at kotlin.metadata.jvm.internal.JvmReadUtils.checkMetadataVersionForRead(JvmReadUtils.kt:79)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:46)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata
public final class ConjunctiveCompositeThreadSafeToggle implements Toggle {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f21850c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile boolean f21852e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList f21848a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap f21849b = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ReentrantLock f21851d = new ReentrantLock();

    public ConjunctiveCompositeThreadSafeToggle(@NotNull List<? extends Toggle> list, @NotNull String str) {
        this.f21850c = a.c(']', "[ConjunctiveCompositeToggle-", str);
        try {
            access$acquireLock(this);
            for (final Toggle toggle : list) {
                ToggleObserver toggleObserver = new ToggleObserver() { // from class: io.appmetrica.analytics.coreutils.internal.toggle.ConjunctiveCompositeThreadSafeToggle$1$1$observer$1
                    @Override // io.appmetrica.analytics.coreapi.internal.control.ToggleObserver
                    public void onStateChanged(boolean z5) {
                        ConjunctiveCompositeThreadSafeToggle conjunctiveCompositeThreadSafeToggle = this.f21853a;
                        Toggle toggle2 = toggle;
                        try {
                            ConjunctiveCompositeThreadSafeToggle.access$acquireLock(conjunctiveCompositeThreadSafeToggle);
                            ConjunctiveCompositeThreadSafeToggle.access$updateState(conjunctiveCompositeThreadSafeToggle, this, z5, String.valueOf(g0.a(toggle2.getClass()).d()));
                        } finally {
                            ConjunctiveCompositeThreadSafeToggle.access$releaseLock(conjunctiveCompositeThreadSafeToggle);
                        }
                    }
                };
                this.f21849b.put(toggleObserver, Boolean.valueOf(toggle.getActualState()));
                toggle.registerObserver(toggleObserver, false);
            }
            setActualState(a(this.f21849b.values()));
            access$releaseLock(this);
        } catch (Throwable th2) {
            access$releaseLock(this);
            throw th2;
        }
    }

    private static boolean a(Collection collection) {
        if ((collection instanceof Collection) && collection.isEmpty()) {
            return true;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!((Boolean) it.next()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final void access$acquireLock(ConjunctiveCompositeThreadSafeToggle conjunctiveCompositeThreadSafeToggle) {
        conjunctiveCompositeThreadSafeToggle.getClass();
        boolean zTryLock = false;
        while (!zTryLock) {
            try {
                k kVar = m.f21341c;
                zTryLock = conjunctiveCompositeThreadSafeToggle.f21851d.tryLock(100L, TimeUnit.MILLISECONDS);
                Unit unit = Unit.f27471a;
            } catch (Throwable th2) {
                k kVar2 = m.f21341c;
                h5.s(th2);
            }
            if (!zTryLock) {
                try {
                    Thread.sleep(100L);
                    Unit unit2 = Unit.f27471a;
                } catch (Throwable th3) {
                    k kVar3 = m.f21341c;
                    h5.s(th3);
                }
            }
        }
    }

    public static final void access$releaseLock(ConjunctiveCompositeThreadSafeToggle conjunctiveCompositeThreadSafeToggle) {
        conjunctiveCompositeThreadSafeToggle.f21851d.unlock();
    }

    public static final void access$updateState(ConjunctiveCompositeThreadSafeToggle conjunctiveCompositeThreadSafeToggle, ToggleObserver toggleObserver, boolean z5, String str) {
        conjunctiveCompositeThreadSafeToggle.f21849b.put(toggleObserver, Boolean.valueOf(z5));
        boolean zA = a(conjunctiveCompositeThreadSafeToggle.f21849b.values());
        if (zA != conjunctiveCompositeThreadSafeToggle.getActualState()) {
            conjunctiveCompositeThreadSafeToggle.setActualState(zA);
            Iterator it = conjunctiveCompositeThreadSafeToggle.f21848a.iterator();
            while (it.hasNext()) {
                ((ToggleObserver) it.next()).onStateChanged(zA);
            }
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.Toggle
    public boolean getActualState() {
        return this.f21852e;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.Toggle
    public void registerObserver(@NotNull ToggleObserver toggleObserver, boolean z5) {
        try {
            access$acquireLock(this);
            this.f21848a.add(toggleObserver);
            if (z5) {
                toggleObserver.onStateChanged(getActualState());
            }
        } finally {
            access$releaseLock(this);
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.Toggle
    public void removeObserver(@NotNull ToggleObserver toggleObserver) {
        try {
            access$acquireLock(this);
            this.f21848a.remove(toggleObserver);
        } finally {
            access$releaseLock(this);
        }
    }

    public void setActualState(boolean z5) {
        this.f21852e = z5;
    }

    @NotNull
    public String toString() {
        return "ConjunctiveCompositeThreadSafeToggle(toggleStates=" + this.f21849b + ", tag='" + this.f21850c + "', actualState=" + getActualState() + ')';
    }
}
