package io.sentry.android.replay.capture;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.r;
import wj.n;

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
public final class BaseCaptureStrategy$persistableAtomicNullable$2$setValue$1 extends r implements Function0<Unit> {
    final /* synthetic */ T $oldValue;
    final /* synthetic */ n $onChange;
    final /* synthetic */ String $propertyName;
    final /* synthetic */ T $value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseCaptureStrategy$persistableAtomicNullable$2$setValue$1(n nVar, String str, T t10, T t11) {
        super(0);
        this.$onChange = nVar;
        this.$propertyName = str;
        this.$oldValue = t10;
        this.$value = t11;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m612invoke();
        return Unit.f27471a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m612invoke() {
        this.$onChange.invoke(this.$propertyName, this.$oldValue, this.$value);
    }
}
