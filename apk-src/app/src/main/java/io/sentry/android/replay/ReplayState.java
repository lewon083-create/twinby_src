package io.sentry.android.replay;

import hl.d;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
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
public final class ReplayState {
    private static final /* synthetic */ pj.a $ENTRIES;
    private static final /* synthetic */ ReplayState[] $VALUES;
    public static final ReplayState INITIAL = new ReplayState("INITIAL", 0);
    public static final ReplayState STARTED = new ReplayState("STARTED", 1);
    public static final ReplayState RESUMED = new ReplayState("RESUMED", 2);
    public static final ReplayState PAUSED = new ReplayState("PAUSED", 3);
    public static final ReplayState STOPPED = new ReplayState("STOPPED", 4);
    public static final ReplayState CLOSED = new ReplayState("CLOSED", 5);

    private static final /* synthetic */ ReplayState[] $values() {
        return new ReplayState[]{INITIAL, STARTED, RESUMED, PAUSED, STOPPED, CLOSED};
    }

    static {
        ReplayState[] replayStateArr$values = $values();
        $VALUES = replayStateArr$values;
        $ENTRIES = d.k(replayStateArr$values);
    }

    private ReplayState(String str, int i) {
    }

    @NotNull
    public static pj.a getEntries() {
        return $ENTRIES;
    }

    public static ReplayState valueOf(String str) {
        return (ReplayState) Enum.valueOf(ReplayState.class, str);
    }

    public static ReplayState[] values() {
        return (ReplayState[]) $VALUES.clone();
    }
}
