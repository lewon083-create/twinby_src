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
public final class tp implements Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f18660a;

    public tp(sy syVar) {
        this.f18660a = syVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final sp deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        sy syVar = this.f18660a;
        ij.p pVar = syVar.m9;
        ij.p pVar2 = syVar.z1;
        ij.p pVar3 = syVar.X2;
        ij.p pVar4 = syVar.T6;
        ij.p pVar5 = syVar.f18443k1;
        if (((u6) JsonPropertyParser.readOptional(parsingContext, jSONObject, "action_animation", syVar.f18503q1)) == null) {
            Expression expression = wp.f18909a;
        }
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "actions", pVar5);
        Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_horizontal", wp.f18916h, v0.f18733v);
        Expression optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_vertical", wp.i, v0.f18734w);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, ViewHierarchyNode.JsonKeys.ALPHA, TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE, wp.f18919l, wp.f18909a);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "animators", syVar.f18533t1);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, A2.f22054g, syVar.F1);
        TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
        Function1<Object, Boolean> function1 = ParsingConvertersKt.ANY_TO_BOOLEAN;
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "capture_focus_on_action", typeHelper, function1, wp.f18910b);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "clip_to_bounds", typeHelper, function1, wp.f18911c);
        TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
        Function1<Number, Long> function12 = ParsingConvertersKt.NUMBER_TO_INT;
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "column_span", typeHelper2, function12, wp.f18920m);
        TypeHelper<String> typeHelper3 = TypeHelpersKt.TYPE_HELPER_STRING;
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "default_state_id", typeHelper3);
        List optionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "disappear_actions", syVar.O2);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "doubletap_actions", pVar5);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "extensions", syVar.f18335a3);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "functions", syVar.H3);
        lo loVar = (lo) JsonPropertyParser.readOptional(parsingContext, jSONObject, "height", pVar4);
        if (loVar == null) {
            loVar = wp.f18912d;
        }
        lo loVar2 = loVar;
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "hover_end_actions", pVar5);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "hover_start_actions", pVar5);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "longtap_actions", pVar5);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "press_end_actions", pVar5);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "press_start_actions", pVar5);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "reuse_id", typeHelper3);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "row_span", typeHelper2, function12, wp.f18921n);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "selected_actions", pVar5);
        JsonPropertyParser.readList(parsingContext, jSONObject, "states", syVar.f18488o7, wp.f18922o);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "tooltips", syVar.O8);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "transition_animation_selector", wp.f18917j, kr.J, wp.f18913e);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "transition_triggers", kv.f17646g, wp.f18923p);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variable_triggers", syVar.U8);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variables", syVar.f18341a9);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, ViewHierarchyNode.JsonKeys.VISIBILITY, wp.f18918k, kv.f17653o, wp.f18914f);
        yw ywVar = (yw) JsonPropertyParser.readOptional(parsingContext, jSONObject, "visibility_action", pVar);
        List optionalList2 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "visibility_actions", pVar);
        lo loVar3 = (lo) JsonPropertyParser.readOptional(parsingContext, jSONObject, "width", pVar4);
        if (loVar3 == null) {
            loVar3 = wp.f18915g;
        }
        return new sp(optionalExpression, optionalExpression2, optionalList, loVar2, ywVar, optionalList2, loVar3);
    }
}
