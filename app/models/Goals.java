package models


public class Goals extends Model{


  public String goalCollection;
  public String goalList;
}
}

getters
  getAllGoalLists() {
    return this.store.findAll(this.collection);
  }

  getGoalList(id) {
    return this.store.findOneBy(this.collection, { id: id });
  }

  getUserGoalList(userid) {
    return this.store.findBy(this.collection, { userid: userid });
  }

  addGoalList(goalList) {
    this.store.add(this.collection, goalList);
    this.store.save();
  }

  removeGoalList(id) {
    const goal = this.getGoalList(id);
    this.store.remove(this.collection, goal);
    this.store.save();
  }

  removeAllGoals() {
    this.store.removeAll(this.collection);
    this.store.save();
  }

  addGoal(userId, newGoal) {
   goalList = this.getUserGoalList(userId);
    logger.debug(`goalList `, goalList);
    goalList[0].goals.push(newGoal);
    this.store.save();
  }

  removeGoal(userId, goalId) {
     goalList = this.getUserGoalList(userId);
    logger.debug(`goalList `, goalList);
     goals = goalList[0].goals;
    remove(goals, { id: goalId });
    this.store.save();
  }
}
