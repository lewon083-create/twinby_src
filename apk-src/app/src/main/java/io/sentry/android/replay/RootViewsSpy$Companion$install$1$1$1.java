package io.sentry.android.replay;

import android.view.View;
import com.google.android.gms.internal.measurement.b4;
import io.sentry.ISentryLifecycleToken;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.r;

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
public final class RootViewsSpy$Companion$install$1$1$1 extends r implements Function1<ArrayList<View>, ArrayList<View>> {
    final /* synthetic */ RootViewsSpy $this_apply;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RootViewsSpy$Companion$install$1$1$1(RootViewsSpy rootViewsSpy) {
        super(1);
        this.$this_apply = rootViewsSpy;
    }

    @Override // kotlin.jvm.functions.Function1
    public final ArrayList<View> invoke(ArrayList<View> mViews) {
        Intrinsics.checkNotNullParameter(mViews, "mViews");
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.$this_apply.viewListLock.acquire();
        try {
            ArrayList<View> arrayList = this.$this_apply.delegatingViewList;
            arrayList.addAll(mViews);
            b4.f(iSentryLifecycleTokenAcquire, null);
            return arrayList;
        } finally {
        }
    }
}
