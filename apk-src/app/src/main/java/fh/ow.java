package fh;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import io.appmetrica.analytics.impl.A2;
import io.sentry.protocol.ViewHierarchyNode;
import java.util.List;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ow implements Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f18072a;

    public ow(sy syVar) {
        this.f18072a = syVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final nw deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        sy syVar = this.f18072a;
        ij.p pVar = syVar.m9;
        ij.p pVar2 = syVar.z1;
        ij.p pVar3 = syVar.X2;
        Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_horizontal", rw.f18275j, v0.f18733v);
        Expression optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_vertical", rw.f18276k, v0.f18734w);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, ViewHierarchyNode.JsonKeys.ALPHA, TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE, rw.f18279n, rw.f18267a);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "animators", syVar.f18533t1);
        TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
        Function1<Object, Boolean> function1 = ParsingConvertersKt.ANY_TO_BOOLEAN;
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "autostart", typeHelper, function1, rw.f18268b);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, A2.f22054g, syVar.F1);
        ij.p pVar4 = syVar.f18443k1;
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "buffering_actions", pVar4);
        TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
        Function1<Number, Long> function12 = ParsingConvertersKt.NUMBER_TO_INT;
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "column_span", typeHelper2, function12, rw.f18280o);
        List optionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "disappear_actions", syVar.O2);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "end_actions", pVar4);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "extensions", syVar.f18335a3);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "fatal_actions", pVar4);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "functions", syVar.H3);
        ij.p pVar5 = syVar.T6;
        lo loVar = (lo) JsonPropertyParser.readOptional(parsingContext, jSONObject, "height", pVar5);
        if (loVar == null) {
            loVar = rw.f18269c;
        }
        lo loVar2 = loVar;
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "muted", typeHelper, function1, rw.f18270d);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "pause_actions", pVar4);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "preload_required", typeHelper, function1, rw.f18271e);
        TypeHelper<String> typeHelper3 = TypeHelpersKt.TYPE_HELPER_STRING;
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "preview", typeHelper3);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "repeatable", typeHelper, function1, rw.f18272f);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "resume_actions", pVar4);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "reuse_id", typeHelper3);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "row_span", typeHelper2, function12, rw.f18281p);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "scale", rw.f18277l, kv.f17652n, rw.f18273g);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "selected_actions", pVar4);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "tooltips", syVar.O8);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "transition_triggers", kv.f17646g, rw.f18282q);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variable_triggers", syVar.U8);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variables", syVar.f18341a9);
        JsonPropertyParser.readList(parsingContext, jSONObject, "video_sources", syVar.f18374d9, rw.f18283r);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, ViewHierarchyNode.JsonKeys.VISIBILITY, rw.f18278m, kv.f17653o, rw.f18274h);
        yw ywVar = (yw) JsonPropertyParser.readOptional(parsingContext, jSONObject, "visibility_action", pVar);
        List optionalList2 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "visibility_actions", pVar);
        lo loVar3 = (lo) JsonPropertyParser.readOptional(parsingContext, jSONObject, "width", pVar5);
        if (loVar3 == null) {
            loVar3 = rw.i;
        }
        return new nw(optionalExpression, optionalExpression2, optionalList, loVar2, ywVar, optionalList2, loVar3);
    }
}
