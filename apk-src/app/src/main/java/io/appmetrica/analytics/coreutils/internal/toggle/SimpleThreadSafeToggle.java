package io.appmetrica.analytics.coreutils.internal.toggle;

import io.appmetrica.analytics.coreapi.internal.control.Toggle;
import io.appmetrica.analytics.coreapi.internal.control.ToggleObserver;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

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
public abstract class SimpleThreadSafeToggle implements Toggle {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f21856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f21857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayList f21858c;

    public SimpleThreadSafeToggle(boolean z5, @NotNull String str) {
        this.f21856a = str;
        this.f21857b = z5;
        this.f21858c = new ArrayList();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.Toggle
    public synchronized boolean getActualState() {
        return this.f21857b;
    }

    @NotNull
    public final String getTag() {
        return this.f21856a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.Toggle
    public synchronized void registerObserver(@NotNull ToggleObserver toggleObserver, boolean z5) {
        this.f21858c.add(toggleObserver);
        if (z5) {
            toggleObserver.onStateChanged(getActualState());
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.Toggle
    public synchronized void removeObserver(@NotNull ToggleObserver toggleObserver) {
        this.f21858c.remove(toggleObserver);
    }

    public final synchronized void updateState(boolean z5) {
        if (z5 != getActualState()) {
            this.f21857b = z5;
            Iterator it = this.f21858c.iterator();
            while (it.hasNext()) {
                ((ToggleObserver) it.next()).onStateChanged(z5);
            }
        }
    }

    public /* synthetic */ SimpleThreadSafeToggle(boolean z5, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z5, str);
    }
}
