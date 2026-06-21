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
import io.sentry.protocol.Device;
import io.sentry.protocol.ViewHierarchyNode;
import java.util.List;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class x9 implements Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f18995a;

    public x9(sy syVar) {
        this.f18995a = syVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final v9 deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        sy syVar = this.f18995a;
        ij.p pVar = syVar.m9;
        ij.p pVar2 = syVar.z1;
        ij.p pVar3 = syVar.X2;
        ij.p pVar4 = syVar.f18494p2;
        ij.p pVar5 = syVar.T6;
        ij.p pVar6 = syVar.f18443k1;
        if (((u6) JsonPropertyParser.readOptional(parsingContext, jSONObject, "action_animation", syVar.f18503q1)) == null) {
            Expression expression = aa.f16801a;
        }
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "actions", pVar6);
        Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_horizontal", aa.f16812m, v0.f18733v);
        Expression optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_vertical", aa.f16813n, v0.f18734w);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, ViewHierarchyNode.JsonKeys.ALPHA, TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE, aa.f16819t, aa.f16801a);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "animators", syVar.f18533t1);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, A2.f22054g, syVar.F1);
        TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
        Function1<Object, Boolean> function1 = ParsingConvertersKt.ANY_TO_BOOLEAN;
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "capture_focus_on_action", typeHelper, function1, aa.f16802b);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "clip_to_bounds", typeHelper, function1, aa.f16803c);
        TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
        Function1<Number, Long> function12 = ParsingConvertersKt.NUMBER_TO_INT;
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "column_span", typeHelper2, function12, aa.f16820u);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "content_alignment_horizontal", aa.f16814o, w9.f18837l, aa.f16804d);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "content_alignment_vertical", aa.f16815p, w9.f18838m, aa.f16805e);
        List optionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "disappear_actions", syVar.O2);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "doubletap_actions", pVar6);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "extensions", syVar.f18335a3);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "functions", syVar.H3);
        lo loVar = (lo) JsonPropertyParser.readOptional(parsingContext, jSONObject, "height", pVar5);
        if (loVar == null) {
            loVar = aa.f16806f;
        }
        lo loVar2 = loVar;
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "hover_end_actions", pVar6);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "hover_start_actions", pVar6);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "item_spacing", typeHelper2, function12, aa.f16821v, aa.f16807g);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "items", syVar.f18530s9);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "layout_mode", aa.f16816q, v0.G, aa.f16808h);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "line_spacing", typeHelper2, function12, aa.f16822w, aa.i);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "longtap_actions", pVar6);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, Device.JsonKeys.ORIENTATION, aa.f16817r, v0.H, aa.f16809j);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "press_end_actions", pVar6);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "press_start_actions", pVar6);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "row_span", typeHelper2, function12, aa.f16823x);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "selected_actions", pVar6);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "tooltips", syVar.O8);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "transition_triggers", kv.f17646g, aa.f16824y);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variable_triggers", syVar.U8);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variables", syVar.f18341a9);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, ViewHierarchyNode.JsonKeys.VISIBILITY, aa.f16818s, kv.f17653o, aa.f16810k);
        yw ywVar = (yw) JsonPropertyParser.readOptional(parsingContext, jSONObject, "visibility_action", pVar);
        List optionalList2 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "visibility_actions", pVar);
        lo loVar3 = (lo) JsonPropertyParser.readOptional(parsingContext, jSONObject, "width", pVar5);
        if (loVar3 == null) {
            loVar3 = aa.f16811l;
        }
        return new v9(optionalExpression, optionalExpression2, optionalList, loVar2, ywVar, optionalList2, loVar3);
    }
}
