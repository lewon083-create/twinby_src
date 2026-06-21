package io.sentry.android.replay.gestures;

import android.view.MotionEvent;
import androidx.compose.runtime.internal.StabilityInferred;
import io.sentry.android.replay.ScreenshotRecorderConfig;
import io.sentry.rrweb.RRWebIncrementalSnapshotEvent;
import io.sentry.rrweb.RRWebInteractionEvent;
import io.sentry.rrweb.RRWebInteractionMoveEvent;
import io.sentry.transport.ICurrentDateProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.r;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

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
/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata
public final class ReplayGestureConverter {
    private static final int CAPTURE_MOVE_EVENT_THRESHOLD = 500;
    private static final int TOUCH_MOVE_DEBOUNCE_THRESHOLD = 50;

    @NotNull
    private final LinkedHashMap<Integer, ArrayList<RRWebInteractionMoveEvent.Position>> currentPositions;

    @NotNull
    private final ICurrentDateProvider dateProvider;
    private long lastCapturedMoveEvent;
    private long touchMoveBaseline;

    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public ReplayGestureConverter(@NotNull ICurrentDateProvider dateProvider) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.dateProvider = dateProvider;
        this.currentPositions = new LinkedHashMap<>(10);
    }

    @Nullable
    public final List<RRWebIncrementalSnapshotEvent> convert(@NotNull MotionEvent event, @NotNull ScreenshotRecorderConfig recorderConfig) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(recorderConfig, "recorderConfig");
        int actionMasked = event.getActionMasked();
        int i = 10;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    long currentTimeMillis = this.dateProvider.getCurrentTimeMillis();
                    long j10 = this.lastCapturedMoveEvent;
                    if (j10 != 0 && j10 + ((long) 50) > currentTimeMillis) {
                        return null;
                    }
                    this.lastCapturedMoveEvent = currentTimeMillis;
                    Set<Integer> setKeySet = this.currentPositions.keySet();
                    Intrinsics.checkNotNullExpressionValue(setKeySet, "<get-keys>(...)");
                    for (Integer num : setKeySet) {
                        Intrinsics.b(num);
                        int iFindPointerIndex = event.findPointerIndex(num.intValue());
                        if (iFindPointerIndex != -1) {
                            if (this.touchMoveBaseline == 0) {
                                this.touchMoveBaseline = currentTimeMillis;
                            }
                            ArrayList<RRWebInteractionMoveEvent.Position> arrayList = this.currentPositions.get(num);
                            Intrinsics.b(arrayList);
                            RRWebInteractionMoveEvent.Position position = new RRWebInteractionMoveEvent.Position();
                            position.setX(recorderConfig.getScaleFactorX() * event.getX(iFindPointerIndex));
                            position.setY(recorderConfig.getScaleFactorY() * event.getY(iFindPointerIndex));
                            position.setId(0);
                            position.setTimeOffset(currentTimeMillis - this.touchMoveBaseline);
                            arrayList.add(position);
                        }
                    }
                    long j11 = currentTimeMillis - this.touchMoveBaseline;
                    if (j11 <= 500) {
                        return null;
                    }
                    ArrayList arrayList2 = new ArrayList(this.currentPositions.size());
                    Iterator<Map.Entry<Integer, ArrayList<RRWebInteractionMoveEvent.Position>>> it = this.currentPositions.entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry<Integer, ArrayList<RRWebInteractionMoveEvent.Position>> next = it.next();
                        int iIntValue = next.getKey().intValue();
                        ArrayList<RRWebInteractionMoveEvent.Position> value = next.getValue();
                        if (!value.isEmpty()) {
                            RRWebInteractionMoveEvent rRWebInteractionMoveEvent = new RRWebInteractionMoveEvent();
                            rRWebInteractionMoveEvent.setTimestamp(currentTimeMillis);
                            ArrayList arrayList3 = new ArrayList(t.j(value, i));
                            for (RRWebInteractionMoveEvent.Position position2 : value) {
                                position2.setTimeOffset(position2.getTimeOffset() - j11);
                                arrayList3.add(position2);
                                it = it;
                            }
                            rRWebInteractionMoveEvent.setPositions(arrayList3);
                            rRWebInteractionMoveEvent.setPointerId(iIntValue);
                            arrayList2.add(rRWebInteractionMoveEvent);
                            ArrayList<RRWebInteractionMoveEvent.Position> arrayList4 = this.currentPositions.get(Integer.valueOf(iIntValue));
                            Intrinsics.b(arrayList4);
                            arrayList4.clear();
                            it = it;
                            i = 10;
                        }
                    }
                    this.touchMoveBaseline = 0L;
                    return arrayList2;
                }
                if (actionMasked == 3) {
                    this.currentPositions.clear();
                    RRWebInteractionEvent rRWebInteractionEvent = new RRWebInteractionEvent();
                    rRWebInteractionEvent.setTimestamp(this.dateProvider.getCurrentTimeMillis());
                    rRWebInteractionEvent.setX(recorderConfig.getScaleFactorX() * event.getX());
                    rRWebInteractionEvent.setY(recorderConfig.getScaleFactorY() * event.getY());
                    rRWebInteractionEvent.setId(0);
                    rRWebInteractionEvent.setPointerId(0);
                    rRWebInteractionEvent.setInteractionType(RRWebInteractionEvent.InteractionType.TouchCancel);
                    return r.c(rRWebInteractionEvent);
                }
                if (actionMasked != 5) {
                    if (actionMasked != 6) {
                        return null;
                    }
                }
            }
            int pointerId = event.getPointerId(event.getActionIndex());
            int iFindPointerIndex2 = event.findPointerIndex(pointerId);
            if (iFindPointerIndex2 == -1) {
                return null;
            }
            this.currentPositions.remove(Integer.valueOf(pointerId));
            RRWebInteractionEvent rRWebInteractionEvent2 = new RRWebInteractionEvent();
            rRWebInteractionEvent2.setTimestamp(this.dateProvider.getCurrentTimeMillis());
            rRWebInteractionEvent2.setX(recorderConfig.getScaleFactorX() * event.getX(iFindPointerIndex2));
            rRWebInteractionEvent2.setY(recorderConfig.getScaleFactorY() * event.getY(iFindPointerIndex2));
            rRWebInteractionEvent2.setId(0);
            rRWebInteractionEvent2.setPointerId(pointerId);
            rRWebInteractionEvent2.setInteractionType(RRWebInteractionEvent.InteractionType.TouchEnd);
            return r.c(rRWebInteractionEvent2);
        }
        int pointerId2 = event.getPointerId(event.getActionIndex());
        int iFindPointerIndex3 = event.findPointerIndex(pointerId2);
        if (iFindPointerIndex3 == -1) {
            return null;
        }
        this.currentPositions.put(Integer.valueOf(pointerId2), new ArrayList<>(10));
        RRWebInteractionEvent rRWebInteractionEvent3 = new RRWebInteractionEvent();
        rRWebInteractionEvent3.setTimestamp(this.dateProvider.getCurrentTimeMillis());
        rRWebInteractionEvent3.setX(recorderConfig.getScaleFactorX() * event.getX(iFindPointerIndex3));
        rRWebInteractionEvent3.setY(recorderConfig.getScaleFactorY() * event.getY(iFindPointerIndex3));
        rRWebInteractionEvent3.setId(0);
        rRWebInteractionEvent3.setPointerId(pointerId2);
        rRWebInteractionEvent3.setInteractionType(RRWebInteractionEvent.InteractionType.TouchStart);
        return r.c(rRWebInteractionEvent3);
    }
}
