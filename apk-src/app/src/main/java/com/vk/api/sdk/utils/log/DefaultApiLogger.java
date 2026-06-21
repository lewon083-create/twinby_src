package com.vk.api.sdk.utils.log;

import android.util.Log;
import com.vk.api.sdk.utils.log.Logger;
import ij.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    java.lang.IllegalArgumentException: Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.
    	at kotlin.metadata.jvm.internal.JvmReadUtils.checkMetadataVersionForRead(JvmReadUtils.kt:79)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:46)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
@Metadata
public class DefaultApiLogger implements Logger {
    private g logLevel;
    private final String tag;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Logger.LogLevel.values().length];
            iArr[Logger.LogLevel.NONE.ordinal()] = 1;
            iArr[Logger.LogLevel.VERBOSE.ordinal()] = 2;
            iArr[Logger.LogLevel.DEBUG.ordinal()] = 3;
            iArr[Logger.LogLevel.WARNING.ordinal()] = 4;
            iArr[Logger.LogLevel.ERROR.ordinal()] = 5;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public DefaultApiLogger(g logLevel, String tag) {
        Intrinsics.checkNotNullParameter(logLevel, "logLevel");
        Intrinsics.checkNotNullParameter(tag, "tag");
        this.logLevel = logLevel;
        this.tag = tag;
    }

    private final boolean checkLevel(Logger.LogLevel logLevel) {
        return ((Logger.LogLevel) getLogLevel().getValue()).ordinal() > logLevel.ordinal();
    }

    @Override // com.vk.api.sdk.utils.log.Logger
    public g getLogLevel() {
        return this.logLevel;
    }

    @Override // com.vk.api.sdk.utils.log.Logger
    public String getTag() {
        return this.tag;
    }

    @Override // com.vk.api.sdk.utils.log.Logger
    public void log(Logger.LogLevel level, String str, Throwable th2) {
        Intrinsics.checkNotNullParameter(level, "level");
        if (checkLevel(level)) {
            return;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[level.ordinal()];
        if (i == 2) {
            Log.v(getTag(), str, th2);
            return;
        }
        if (i == 3) {
            Log.d(getTag(), str, th2);
        } else if (i == 4) {
            Log.w(getTag(), str, th2);
        } else {
            if (i != 5) {
                return;
            }
            Log.e(getTag(), str, th2);
        }
    }

    public void setLogLevel(g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<set-?>");
        this.logLevel = gVar;
    }
}
