package com.vk.api.sdk.utils;

import android.os.Build;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
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
/* JADX INFO: loaded from: classes.dex */
@Metadata
public final class DefaultUserAgent$stringify$2 extends r implements Function0<String> {
    final /* synthetic */ DefaultUserAgent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultUserAgent$stringify$2(DefaultUserAgent defaultUserAgent) {
        super(0);
        this.this$0 = defaultUserAgent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        String str = String.format(Locale.US, "%s/%s-%s (Android %s; SDK %d; %s; %s %s; %s; %dx%d)", Arrays.copyOf(new Object[]{this.this$0.getPrefix(), this.this$0.getAppVersion(), this.this$0.getAppBuild(), Build.VERSION.RELEASE, Integer.valueOf(Build.VERSION.SDK_INT), Build.CPU_ABI, Build.MANUFACTURER, Build.MODEL, System.getProperty("user.language"), Integer.valueOf(Math.max(this.this$0.getDisplaySize().x, this.this$0.getDisplaySize().y)), Integer.valueOf(Math.min(this.this$0.getDisplaySize().x, this.this$0.getDisplaySize().y))}, 11));
        Intrinsics.checkNotNullExpressionValue(str, "java.lang.String.format(locale, format, *args)");
        return VKUtils.toHumanReadableAscii(str);
    }
}
