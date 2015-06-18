package org.practise.ejb.service.impl;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import org.practise.ejb.service.CarService;

@Stateless
@Remote(CarService.class)
public class CarServiceImpl implements CarService {

	@Override
	public String annualService() {
		return "annual service of any car is £110.00";

	}

	@Override
	public String repair(int model) {
		if (model > 2005) {
			return "Standard diagnosis cost is £150.00. Any additional repairs are extra!!";
		}
		return "Sorry, we dont provide repair service for any cars older than 2005";

	}

}
